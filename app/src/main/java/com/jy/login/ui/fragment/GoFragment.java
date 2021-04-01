package com.jy.login.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import com.jy.login.R;
import com.jy.login.base.BaseFragment;
import com.jy.login.interfaces.shop.IShop;
import com.jy.login.loginActivity;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.TabBean;
import com.jy.login.persenter.ShopPersenter;
import com.jy.login.ui.adapter.GoodsAdapter;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class GoFragment extends BaseFragment<ShopPersenter> implements IShop.View {

    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.bt_main_logout)
    Button btMainLogout;
    @BindView(R.id.tablayout)
    TabLayout tablayout;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.recygoods)
    RecyclerView recygoods;
    private ArrayList<GoodsBean.DataBean.YRinitlistBean._$10Bean.ContentBean.GoodslistBean> goodslist;
    private GoodsAdapter goodsAdapter;

    @Override
    public int getLatout() {
        return R.layout.fragment_go;
    }

    @Override
    public void initView() {

        goodslist = new ArrayList<>();

        recygoods.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        goodsAdapter = new GoodsAdapter(goodslist, getActivity());
        recygoods.setAdapter(goodsAdapter);

        btMainLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), loginActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

//        View root = LayoutInflater.from(getActivity()).inflate(R.layout.item_pop, null);
//        final PopupWindow popupWindow = new PopupWindow(root, 600, 300);
//        popupWindow.setBackgroundDrawable(new ColorDrawable());
//        popupWindow.setOutsideTouchable(true);
//        Button btn_ok = root.findViewById(R.id.btn_ok);
//        Button btn_no = root.findViewById(R.id.btn_no);
//        btn_ok.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                popupWindow.dismiss();
//            }
//        });
//        btn_no.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                popupWindow.dismiss();
//            }
//        });
//
//        // 产生背景变暗效果
//        WindowManager.LayoutParams lp = getActivity().getWindow()
//                .getAttributes();
//        lp.alpha = 0.4f;
//        getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
//        getActivity().getWindow().setAttributes(lp);
//        popupWindow.setTouchable(true);
//        popupWindow.setFocusable(true);
//        popupWindow.setBackgroundDrawable(new BitmapDrawable());
//        popupWindow.setOutsideTouchable(true);
//        popupWindow.update();
//        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
//
//            // 在dismiss中恢复透明度
//            public void onDismiss() {
//                WindowManager.LayoutParams lp = getActivity().getWindow()
//                        .getAttributes();
//                lp.alpha = 1f;
//                getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
//                getActivity().getWindow().setAttributes(lp);
//            }
//        });
//
//        popupWindow.showAtLocation(tvTitle1, Gravity.CENTER, 0, 0);
    }

    @Override
    public ShopPersenter createPresenter() {
        return new ShopPersenter(this);
    }

    @Override
    public void initData() {
        presenter.getbanner();
        presenter.getgoods();
        presenter.gettab();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void getbanner(BannerBean bannerBean) {
        if (bannerBean.getData() != null) {
            initBanner(bannerBean.getData().getYRinitlist().get(0).getContent().getNav_list());
        }
    }

    @Override
    public void getgoods(GoodsBean goodsBean) {
        if (goodsBean.getData() != null) {
            initGoods(goodsBean.getData().getYRinitlist().get_$10().getContent().getGoodslist());
        }
    }

    @Override
    public void gettab(TabBean tabBean) {
        List<TabBean.DataBean.DrageListBean> list = tabBean.getData().getDrage_list();
        List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            SubFragment subFragment = new SubFragment();
            fragments.add(subFragment);
        }

        viewpager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
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

        for (int i = 0; i < list.size(); i++) {
            tablayout.getTabAt(i).setText(list.get(i).getName());
        }
    }

    private void initGoods(List<GoodsBean.DataBean.YRinitlistBean._$10Bean.ContentBean.GoodslistBean> list) {
        goodslist.addAll(list);
        goodsAdapter.notifyDataSetChanged();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initBanner(List<BannerBean.DataBean.YRinitlistBean.ContentBean.NavListBean> list) {
        banner.setImages(list).setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                BannerBean.DataBean.YRinitlistBean.ContentBean.NavListBean bean = (BannerBean.DataBean.YRinitlistBean.ContentBean.NavListBean) path;
                Glide.with(context).load(bean.getImg()).into(imageView);
            }
        }).start();

        banner.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 30);
            }
        });

        banner.setClipToOutline(true);
    }
}