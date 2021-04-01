package com.jy.login.api;

import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.TabBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface ShopApi {
//    String BASE_URL = "https://cdplay.cn/";
//
//    @GET("api/index")
//    Flowable<ShopBean> getshop();

    String BASE_URL = "https://103.yangrong2.top/index.php/Wxsmall/";

    @GET("?c=Index&a=get_vindex&de_wx_id=98&YRshopid=1&YRtemp=1&action_type=is_app")
    Flowable<BannerBean> getbanner();

    @GET("?c=Index&a=get_vindex&pagefrom=10&page=1&de_wx_id=0&stepnowtime=0&YRshopid=1&YRtemp=1&action_type=is_app")
    Flowable<GoodsBean> getgoods();

    @GET("?c=Index&a=get_category&action_type=is_app")
    Flowable<TabBean> gettab();
}
