package com.jy.login.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.jy.login.DBOpenHelper;
import com.jy.login.MainActivity;
import com.jy.login.R;
import com.jy.login.RegisterActivity;
import com.jy.login.User;

import java.util.ArrayList;

public class PasswordFragment extends Fragment implements View.OnClickListener {
    private EditText mLoginactivityUsernameEt;
    private EditText mLoginactivityPasswordEt;
    private Button mLoginactivityLoginBt;
    private TextView mLoginactivityRegisterTv;
    private DBOpenHelper mDBOpenHelper;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_password, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(@NonNull final View itemView) {
        mLoginactivityUsernameEt = (EditText) itemView.findViewById(R.id.et_loginactivity_username);
        mLoginactivityPasswordEt = (EditText) itemView.findViewById(R.id.et_loginactivity_password);
        mLoginactivityLoginBt = (Button) itemView.findViewById(R.id.bt_loginactivity_login);
        mLoginactivityLoginBt.setOnClickListener(this);
        mLoginactivityRegisterTv = (TextView) itemView.findViewById(R.id.tv_loginactivity_register);
        mLoginactivityRegisterTv.setOnClickListener(this);
        mDBOpenHelper = new DBOpenHelper(getActivity());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_loginactivity_login:
                String name = mLoginactivityUsernameEt.getText().toString().trim();
                String password = mLoginactivityPasswordEt.getText().toString().trim();
                if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(password)) {
                    ArrayList<User> data = mDBOpenHelper.getAllData();
                    boolean match = false;
                    for (int i = 0; i < data.size(); i++) {
                        User user = data.get(i);
                        if (name.equals(user.getName()) && password.equals(user.getPassword())) {
                            match = true;
                            break;
                        } else {
                            match = false;
                        }
                    }
                    if (match) {
                        Toast.makeText(getActivity(), "登录成功", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getActivity(), MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getActivity(), "用户名或密码不正确，请重新输入", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getActivity(), "请输入你的用户名或密码", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.tv_loginactivity_register:
                startActivity(new Intent(getActivity(), RegisterActivity.class));
                break;
            default:
                break;
        }
    }
}