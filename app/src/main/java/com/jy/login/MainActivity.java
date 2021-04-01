package com.jy.login;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.jy.login.ui.fragment.GoFragment;
import com.jy.login.ui.fragment.MeFragment;
import com.jy.login.ui.fragment.ShopFragment;
import com.jy.login.ui.fragment.VideoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewpager;
    private TabLayout mTablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        // 初始化控件对象
//        Button mBtMainLogout = findViewById(R.id.bt_main_logout);
        // 绑定点击监听器
//        mBtMainLogout.setOnClickListener(this);

        mViewpager = (ViewPager) findViewById(R.id.viewpager);
        mTablayout = (TabLayout) findViewById(R.id.tablayout);

        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new ShopFragment());
        fragments.add(new GoFragment());
        fragments.add(new VideoFragment());
        fragments.add(new MeFragment());

        mViewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
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

        mTablayout.setupWithViewPager(mViewpager);

        mTablayout.setTabTextColors(Color.parseColor("#000000"),Color.parseColor("#FFEB3B"));

        mTablayout.getTabAt(0).setText("首页").setIcon(R.drawable.selecter);
        mTablayout.getTabAt(1).setText("同城配送").setIcon(R.drawable.selecter1);
        mTablayout.getTabAt(2).setText("教你做").setIcon(R.drawable.selecter2);
        mTablayout.getTabAt(3).setText("我的").setIcon(R.drawable.selecter3);
    }

//    public void onClick(View view) {
//        if (view.getId() == R.id.bt_main_logout) {
//            Intent intent = new Intent(this,loginActivity.class);
//            startActivity(intent);
//            finish();
//        }
//    }
}