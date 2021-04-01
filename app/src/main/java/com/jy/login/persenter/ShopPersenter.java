package com.jy.login.persenter;

import com.jy.login.base.BasePresenter;
import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.shop.IShop;
import com.jy.login.model.ShopModel;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.TabBean;

public class ShopPersenter extends BasePresenter<IShop.View> implements IShop.Persenter {

    IShop.Model model;
    IShop.View view;

    public ShopPersenter(IShop.View view) {

        this.view = view;
        model = new ShopModel();
    }

    @Override
    public void getbanner() {
        model.getbanner(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view != null) {
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view != null) {
                    view.getbanner((BannerBean) o);
                }
            }
        });
    }

    @Override
    public void getgoods() {
        model.getgoods(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view != null) {
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view != null) {
                    view.getgoods((GoodsBean) o);
                }
            }
        });
    }

    @Override
    public void gettab() {
        model.gettab(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view!=null){
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view!=null){
                    view.gettab((TabBean) o);
                }
            }
        });
    }
}
