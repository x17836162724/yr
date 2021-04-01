package com.jy.login.interfaces.shop;

import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.IBasePresenter;
import com.jy.login.interfaces.IBaseView;
import com.jy.login.interfaces.IModel;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.TabBean;

public interface IShop {
    interface View extends IBaseView {
        //定义一个被推荐页实现的View层接口方法
        void getbanner(BannerBean bannerBean);
        void getgoods(GoodsBean goodsBean);
        void gettab(TabBean tabBean);
    }

    interface Persenter extends IBasePresenter<View> {
        //定义一个首页推荐页面V层调用的接口
        void getbanner();
        void getgoods();
        void gettab();
    }

    interface Model extends IModel {
        //定义一个加载推荐数据的接口方法 被P层
        void getbanner(CallBack callBack);
        void getgoods(CallBack callBack);
        void gettab(CallBack callBack);
    }
}
