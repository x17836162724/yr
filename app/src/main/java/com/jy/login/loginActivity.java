package com.jy.login;
/**
 * 纯粹实现登录注册功能，其它功能都被注释掉了
 * 起作用的代码（连带着packag、import算上） 共 73 行
 * 不多吧？
 */

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.jy.login.MainActivity;
import com.jy.login.R;
import com.jy.login.User;
import com.jy.login.ui.fragment.PasswordFragment;
import com.jy.login.ui.fragment.PhoneFragment;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by littlecurl 2018/6/24
 */

/**
 * 此类 implements View.OnClickListener 之后，
 * 就可以把onClick事件写到onCreate()方法之外
 * 这样，onCreate()方法中的代码就不会显得很冗余
 */
public class loginActivity extends AppCompatActivity {
    /**
     * 声明自己写的 DBOpenHelper 对象
     * DBOpenHelper(extends SQLiteOpenHelper) 主要用来
     * 创建数据表
     * 然后再进行数据表的增、删、改、查操作
     */
    private ViewPager viewpager;
    private TabLayout tablayout;




    /**
     * 创建 Activity 时先来重写 onCreate() 方法
     * 保存实例状态
     * super.onCreate(savedInstanceState);
     * 设置视图内容的配置文件
     * setContentView(R.layout.activity_login);
     * 上面这行代码真正实现了把视图层 View 也就是 layout 的内容放到 Activity 中进行显示
     * 初始化视图中的控件对象 initView()
     * 实例化 DBOpenHelper，待会进行登录验证的时候要用来进行数据查询
     * mDBOpenHelper = new DBOpenHelper(this);
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();


    }

    /**
     * onCreae()中大的布局已经摆放好了，接下来就该把layout里的东西
     * 声明、实例化对象然后有行为的赋予其行为
     * 这样就可以把视图层View也就是layout 与 控制层 Java 结合起来了
     */
    private void initView() {
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        tablayout = (TabLayout) findViewById(R.id.tablayout);

        final List<Fragment> fragments = new ArrayList<>();
        fragments.add(new PhoneFragment());
        fragments.add(new PasswordFragment());

        viewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });

        tablayout.setupWithViewPager(viewpager);

        tablayout.setTabTextColors(Color.parseColor("#000000"),Color.parseColor("#ffffff"));

        tablayout.getTabAt(0).setText("手机号快速登陆");
        tablayout.getTabAt(1).setText("账号密码登录");
    }
}



