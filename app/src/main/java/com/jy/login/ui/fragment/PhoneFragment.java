package com.jy.login.ui.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.jy.login.MainActivity;
import com.jy.login.R;
import com.jy.login.RegisterActivity;
import com.mob.MobSDK;

import org.json.JSONObject;

import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;

public class PhoneFragment extends Fragment implements View.OnClickListener {
    private TextView mLoginactivityRegisterTv;
    private EditText mNumberPhone;
    private EditText mCodeVerification;
    private Button mSendVerificationCodeButton;
    private Button mLoginButton;
    private static final String TAG = "SmsYanzheng";
    EventHandler eventHandler;
    String strPhoneNumber;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_phone, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(@NonNull final View itemView) {
        mNumberPhone = (EditText) itemView.findViewById(R.id.phone_number);
        mCodeVerification = (EditText) itemView.findViewById(R.id.verification_code);
        mSendVerificationCodeButton = (Button) itemView.findViewById(R.id.button_send_verification_code);
        mSendVerificationCodeButton.setOnClickListener(this);
        mLoginButton = (Button) itemView.findViewById(R.id.button_login);
        mLoginButton.setOnClickListener(this);
        mLoginactivityRegisterTv = (TextView) itemView.findViewById(R.id.tv_loginactivity_register);
        mLoginactivityRegisterTv.setOnClickListener(this);
        MobSDK.init(getActivity(),"25e683f4c7236","c566ba81dbe8289cd6b7bacf0b40842b");
//        SMSSDK.initSDK(this, "app key", "app secret"); //使用你申请的key 和 secret

        eventHandler = new EventHandler() {

            /**
             * 在操作之后被触发
             *
             * @param event  参数1
             * @param result 参数2 SMSSDK.RESULT_COMPLETE表示操作成功，为SMSSDK.RESULT_ERROR表示操作失败
             * @param data   事件操作的结果
             */

            @Override
            public void afterEvent(int event, int result, Object data) {
                Message message = myHandler.obtainMessage(0x00);
                message.arg1 = event;
                message.arg2 = result;
                message.obj = data;
                myHandler.sendMessage(message);
            }
        };

        SMSSDK.registerEventHandler(eventHandler);
    }

    public void onDestroy() {
        super.onDestroy();
        //用完回调要注销掉，否则可能会出现内存泄露
        SMSSDK.unregisterEventHandler(eventHandler);
    };

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_login) {
            String strCode = mCodeVerification.getText().toString();
            if (null != strCode && strCode.length() == 4) {
                Log.d(TAG, mCodeVerification.getText().toString());
                SMSSDK.submitVerificationCode("86", strPhoneNumber, mCodeVerification.getText().toString());
            } else {
                Toast.makeText(getActivity(), "验证码长度不正确", Toast.LENGTH_SHORT).show();
            }
        } else if (v.getId() == R.id.button_send_verification_code) {
            strPhoneNumber = mNumberPhone.getText().toString();
            if (null == strPhoneNumber || "".equals(strPhoneNumber) || strPhoneNumber.length() != 11) {
                Toast.makeText(getActivity(), "请输入电话号码", Toast.LENGTH_SHORT).show();
                return;
            }
            SMSSDK.getVerificationCode("86", strPhoneNumber);
            mSendVerificationCodeButton.setClickable(false);
            //开启线程去更新button的text
            new Thread() {
                @Override
                public void run() {
                    int totalTime = 60;
                    for (int i = 0; i < totalTime; i++) {
                        Message message = myHandler.obtainMessage(0x01);
                        message.arg1 = totalTime - i;
                        myHandler.sendMessage(message);
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    myHandler.sendEmptyMessage(0x02);
                }
            }.start();
        }else if (v.getId()==R.id.tv_loginactivity_register){
            startActivity(new Intent(getActivity(), RegisterActivity.class));
        }
    }

    @SuppressLint("HandlerLeak")
    Handler myHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0x00:
                    int event = msg.arg1;
                    int result = msg.arg2;
                    Object data = msg.obj;
                    Log.e(TAG, "result : " + result + ", event: " + event + ", data : " + data);
                    if (result == SMSSDK.RESULT_COMPLETE) { //回调  当返回的结果是complete
                        if (event == SMSSDK.EVENT_GET_VERIFICATION_CODE) { //获取验证码
                            Toast.makeText(getActivity(), "发送验证码成功", Toast.LENGTH_SHORT).show();
                            Log.d(TAG, "get verification code successful.");
                        } else if (event == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) { //提交验证码
                            Log.d(TAG, "submit code successful");
                            Toast.makeText(getActivity(), "提交验证码成功", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getActivity(), MainActivity.class);
                            startActivity(intent);
                            getActivity().finish();
                        } else {
                            Log.d(TAG, data.toString());
                        }
                    } else { //进行操作出错，通过下面的信息区分析错误原因
                        try {
                            Throwable throwable = (Throwable) data;
                            throwable.printStackTrace();
                            JSONObject object = new JSONObject(throwable.getMessage());
                            String des = object.optString("detail");//错误描述
                            int status = object.optInt("status");//错误代码
                            //错误代码：  http://wiki.mob.com/android-api-%E9%94%99%E8%AF%AF%E7%A0%81%E5%8F%82%E8%80%83/
                            Log.e(TAG, "status: " + status + ", detail: " + des);
                            if (status > 0 && !TextUtils.isEmpty(des)) {
                                Toast.makeText(getActivity(), des, Toast.LENGTH_SHORT).show();
                                return;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 0x01:
                    mSendVerificationCodeButton.setText("重新发送(" + msg.arg1 + ")");
                    break;
                case 0x02:
                    mSendVerificationCodeButton.setText("获取验证码");
                    mSendVerificationCodeButton.setClickable(true);
                    break;
            }
        }
    };
}