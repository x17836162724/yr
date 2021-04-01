package com.jy.login.model.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TabBean {

    /**
     * status : 1
     * data : {"cate_list":[{"id":"0","name":"店铺推荐"},{"id":"66","name":"推荐","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"1617081402","allparent":"0","allson":"66","child":0},{"id":"61","name":"美发","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"0","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"61","child":0},{"id":"60","name":"生鲜果蔬","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"60","child":0},{"id":"49","name":"童装","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"49","child":0},{"id":"48","name":"乐器","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"48","child":0},{"id":"47","name":"玩具","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"47","child":0},{"id":"44","name":"车品","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"44","child":0},{"id":"43","name":"企业","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"43","child":0},{"id":"42","name":"电器","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"42","child":0},{"id":"41","name":"数码","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"41","child":0},{"id":"40","name":"洗护","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"40","child":0},{"id":"39","name":"家装","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"39","child":0},{"id":"38","name":"美妆","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"38","child":0},{"id":"37","name":"饰品","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"37","child":0},{"id":"36","name":"食品餐饮","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"0","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"36","child":0},{"id":"34","name":"内衣","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"34","child":0},{"id":"33","name":"百货","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"33","child":0},{"id":"32","name":"箱包","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"32","child":0},{"id":"31","name":"鞋帽","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"31","child":0},{"id":"30","name":"进口","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"30","child":0},{"id":"29","name":"运动","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"29","child":0},{"id":"28","name":"手机","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"28","child":0},{"id":"26","name":"男装","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"26","child":0},{"id":"25","name":"女装","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"25","child":0},{"id":"22","name":"生活","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"1","shop_id":"0","updatetime":"0","allparent":"0","allson":"22,23,24","child":1,"child_cate":[{"id":"24","name":"结婚摄影","pid":"22","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"1","shop_id":"0","updatetime":"0","allparent":"22,0","allson":"24","child_count":0}]},{"id":"15","name":"数码家电","pid":"0","type_id":"0","class":"587555","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"数码家电","seokeywords":"数码家电","seodescription":"数码家电","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"15","child":0},{"id":"2","name":"母婴童装","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"33","status":"1","seotitle":"母婴童装","seokeywords":"母婴童装","seodescription":"母婴童装","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20200817/5f3a489fd5ff8.jpg","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"2,8,9,21","child":3,"child_cate":[{"id":"21","name":"童鞋","pid":"2","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"童鞋","seokeywords":"童鞋","seodescription":"童鞋","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"2,0","allson":"21","child_count":0},{"id":"8","name":"童装童鞋","pid":"2","type_id":"0","class":"abvc","is_home":"0","is_online_buy":"1","sort":"201","status":"1","seotitle":"童装童鞋","seokeywords":"童装童鞋","seodescription":"童装童鞋","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"2,0","allson":"8","child_count":0},{"id":"9","name":"儿童玩具","pid":"2","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"205","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"2,0","allson":"9","child_count":0}]},{"id":"4","name":"鞋靴箱包","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"40","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"4","child":0},{"id":"5","name":"礼品鲜花","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"50","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"5","child":0},{"id":"55","name":"汽车","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"0","sort":"109","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"55","child":0}],"screen_list":[{"screen_order":"6","name":"爆品"},{"screen_order":"3","name":"限时促销"},{"screen_order":"4","name":"优惠活动"},{"screen_order":"5","name":"会员专享"}],"order_list":[{"order":"","name":"默认排序"},{"order":"sell_count","name":"销量排序"},{"order":"money_desc","name":"价格由高到低"},{"order":"money_asc","name":"价格由低到高"}],"drage_list":[{"id":"23","name":"女装"},{"id":"88","name":"生鲜果蔬"},{"id":"24","name":"男装"},{"id":"21","name":"童装"},{"id":"25","name":"汽车"},{"id":"36","name":"美妆"},{"id":"34","name":"房产"},{"id":"37","name":"家装"},{"id":"38","name":"洗护"},{"id":"35","name":"珠宝"},{"id":"43","name":"酒店"},{"id":"86","name":"酒水"},{"id":"26","name":"手机"},{"id":"39","name":"数码"},{"id":"40","name":"电器"},{"id":"22","name":"家居"},{"id":"31","name":"百货"},{"id":"33","name":"母婴"},{"id":"27","name":"运动"},{"id":"29","name":"鞋帽"},{"id":"30","name":"箱包"},{"id":"32","name":"内衣"},{"id":"28","name":"广告"},{"id":"42","name":"车装饰"},{"id":"41","name":"企业"}],"drage_count":25,"selfnum":"3"}
     */

    private int status;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * cate_list : [{"id":"0","name":"店铺推荐"},{"id":"66","name":"推荐","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"1617081402","allparent":"0","allson":"66","child":0},{"id":"61","name":"美发","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"0","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"61","child":0},{"id":"60","name":"生鲜果蔬","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"60","child":0},{"id":"49","name":"童装","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"49","child":0},{"id":"48","name":"乐器","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"48","child":0},{"id":"47","name":"玩具","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"47","child":0},{"id":"44","name":"车品","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"44","child":0},{"id":"43","name":"企业","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"43","child":0},{"id":"42","name":"电器","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"42","child":0},{"id":"41","name":"数码","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"41","child":0},{"id":"40","name":"洗护","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"40","child":0},{"id":"39","name":"家装","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"39","child":0},{"id":"38","name":"美妆","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"38","child":0},{"id":"37","name":"饰品","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"37","child":0},{"id":"36","name":"食品餐饮","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"0","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"36","child":0},{"id":"34","name":"内衣","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"34","child":0},{"id":"33","name":"百货","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"33","child":0},{"id":"32","name":"箱包","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"32","child":0},{"id":"31","name":"鞋帽","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"31","child":0},{"id":"30","name":"进口","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"30","child":0},{"id":"29","name":"运动","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"29","child":0},{"id":"28","name":"手机","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"28","child":0},{"id":"26","name":"男装","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"26","child":0},{"id":"25","name":"女装","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"25","child":0},{"id":"22","name":"生活","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"1","shop_id":"0","updatetime":"0","allparent":"0","allson":"22,23,24","child":1,"child_cate":[{"id":"24","name":"结婚摄影","pid":"22","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"1","shop_id":"0","updatetime":"0","allparent":"22,0","allson":"24","child_count":0}]},{"id":"15","name":"数码家电","pid":"0","type_id":"0","class":"587555","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"数码家电","seokeywords":"数码家电","seodescription":"数码家电","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"15","child":0},{"id":"2","name":"母婴童装","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"33","status":"1","seotitle":"母婴童装","seokeywords":"母婴童装","seodescription":"母婴童装","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20200817/5f3a489fd5ff8.jpg","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"2,8,9,21","child":3,"child_cate":[{"id":"21","name":"童鞋","pid":"2","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"童鞋","seokeywords":"童鞋","seodescription":"童鞋","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"2,0","allson":"21","child_count":0},{"id":"8","name":"童装童鞋","pid":"2","type_id":"0","class":"abvc","is_home":"0","is_online_buy":"1","sort":"201","status":"1","seotitle":"童装童鞋","seokeywords":"童装童鞋","seodescription":"童装童鞋","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"2,0","allson":"8","child_count":0},{"id":"9","name":"儿童玩具","pid":"2","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"205","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"2,0","allson":"9","child_count":0}]},{"id":"4","name":"鞋靴箱包","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"40","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"4","child":0},{"id":"5","name":"礼品鲜花","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"50","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"5","child":0},{"id":"55","name":"汽车","pid":"0","type_id":"0","class":"","is_home":"0","is_online_buy":"0","sort":"109","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"0","allparent":"0","allson":"55","child":0}]
         * screen_list : [{"screen_order":"6","name":"爆品"},{"screen_order":"3","name":"限时促销"},{"screen_order":"4","name":"优惠活动"},{"screen_order":"5","name":"会员专享"}]
         * order_list : [{"order":"","name":"默认排序"},{"order":"sell_count","name":"销量排序"},{"order":"money_desc","name":"价格由高到低"},{"order":"money_asc","name":"价格由低到高"}]
         * drage_list : [{"id":"23","name":"女装"},{"id":"88","name":"生鲜果蔬"},{"id":"24","name":"男装"},{"id":"21","name":"童装"},{"id":"25","name":"汽车"},{"id":"36","name":"美妆"},{"id":"34","name":"房产"},{"id":"37","name":"家装"},{"id":"38","name":"洗护"},{"id":"35","name":"珠宝"},{"id":"43","name":"酒店"},{"id":"86","name":"酒水"},{"id":"26","name":"手机"},{"id":"39","name":"数码"},{"id":"40","name":"电器"},{"id":"22","name":"家居"},{"id":"31","name":"百货"},{"id":"33","name":"母婴"},{"id":"27","name":"运动"},{"id":"29","name":"鞋帽"},{"id":"30","name":"箱包"},{"id":"32","name":"内衣"},{"id":"28","name":"广告"},{"id":"42","name":"车装饰"},{"id":"41","name":"企业"}]
         * drage_count : 25
         * selfnum : 3
         */

        private int drage_count;
        private String selfnum;
        private List<CateListBean> cate_list;
        private List<ScreenListBean> screen_list;
        private List<OrderListBean> order_list;
        private List<DrageListBean> drage_list;

        public int getDrage_count() {
            return drage_count;
        }

        public void setDrage_count(int drage_count) {
            this.drage_count = drage_count;
        }

        public String getSelfnum() {
            return selfnum;
        }

        public void setSelfnum(String selfnum) {
            this.selfnum = selfnum;
        }

        public List<CateListBean> getCate_list() {
            return cate_list;
        }

        public void setCate_list(List<CateListBean> cate_list) {
            this.cate_list = cate_list;
        }

        public List<ScreenListBean> getScreen_list() {
            return screen_list;
        }

        public void setScreen_list(List<ScreenListBean> screen_list) {
            this.screen_list = screen_list;
        }

        public List<OrderListBean> getOrder_list() {
            return order_list;
        }

        public void setOrder_list(List<OrderListBean> order_list) {
            this.order_list = order_list;
        }

        public List<DrageListBean> getDrage_list() {
            return drage_list;
        }

        public void setDrage_list(List<DrageListBean> drage_list) {
            this.drage_list = drage_list;
        }

        public static class CateListBean {
            /**
             * id : 0
             * name : 店铺推荐
             * pid : 0
             * type_id : 0
             * class :
             * is_home : 0
             * is_online_buy : 1
             * sort : 10
             * status : 1
             * seotitle :
             * seokeywords :
             * seodescription :
             * measure_unit :
             * show_in_nav : 0
             * grade : 0
             * price : 0.00
             * icon :
             * img : https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png
             * balance_rate : 1.00
             * type : 0
             * shop_id : 0
             * updatetime : 1617081402
             * allparent : 0
             * allson : 66
             * child : 0
             * child_cate : [{"id":"24","name":"结婚摄影","pid":"22","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"10","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png","balance_rate":"1.00","type":"1","shop_id":"0","updatetime":"0","allparent":"22,0","allson":"24","child_count":0}]
             */

            private String id;
            private String name;
            private String pid;
            private String type_id;
            @SerializedName("class")
            private String classX;
            private String is_home;
            private String is_online_buy;
            private String sort;
            private String status;
            private String seotitle;
            private String seokeywords;
            private String seodescription;
            private String measure_unit;
            private String show_in_nav;
            private String grade;
            private String price;
            private String icon;
            private String img;
            private String balance_rate;
            private String type;
            private String shop_id;
            private String updatetime;
            private String allparent;
            private String allson;
            private int child;
            private List<ChildCateBean> child_cate;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getType_id() {
                return type_id;
            }

            public void setType_id(String type_id) {
                this.type_id = type_id;
            }

            public String getClassX() {
                return classX;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getIs_home() {
                return is_home;
            }

            public void setIs_home(String is_home) {
                this.is_home = is_home;
            }

            public String getIs_online_buy() {
                return is_online_buy;
            }

            public void setIs_online_buy(String is_online_buy) {
                this.is_online_buy = is_online_buy;
            }

            public String getSort() {
                return sort;
            }

            public void setSort(String sort) {
                this.sort = sort;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getSeotitle() {
                return seotitle;
            }

            public void setSeotitle(String seotitle) {
                this.seotitle = seotitle;
            }

            public String getSeokeywords() {
                return seokeywords;
            }

            public void setSeokeywords(String seokeywords) {
                this.seokeywords = seokeywords;
            }

            public String getSeodescription() {
                return seodescription;
            }

            public void setSeodescription(String seodescription) {
                this.seodescription = seodescription;
            }

            public String getMeasure_unit() {
                return measure_unit;
            }

            public void setMeasure_unit(String measure_unit) {
                this.measure_unit = measure_unit;
            }

            public String getShow_in_nav() {
                return show_in_nav;
            }

            public void setShow_in_nav(String show_in_nav) {
                this.show_in_nav = show_in_nav;
            }

            public String getGrade() {
                return grade;
            }

            public void setGrade(String grade) {
                this.grade = grade;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getBalance_rate() {
                return balance_rate;
            }

            public void setBalance_rate(String balance_rate) {
                this.balance_rate = balance_rate;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getShop_id() {
                return shop_id;
            }

            public void setShop_id(String shop_id) {
                this.shop_id = shop_id;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getAllparent() {
                return allparent;
            }

            public void setAllparent(String allparent) {
                this.allparent = allparent;
            }

            public String getAllson() {
                return allson;
            }

            public void setAllson(String allson) {
                this.allson = allson;
            }

            public int getChild() {
                return child;
            }

            public void setChild(int child) {
                this.child = child;
            }

            public List<ChildCateBean> getChild_cate() {
                return child_cate;
            }

            public void setChild_cate(List<ChildCateBean> child_cate) {
                this.child_cate = child_cate;
            }

            public static class ChildCateBean {
                /**
                 * id : 24
                 * name : 结婚摄影
                 * pid : 22
                 * type_id : 0
                 * class :
                 * is_home : 0
                 * is_online_buy : 1
                 * sort : 10
                 * status : 1
                 * seotitle :
                 * seokeywords :
                 * seodescription :
                 * measure_unit :
                 * show_in_nav : 0
                 * grade : 0
                 * price : 0.00
                 * icon :
                 * img : https://103.yangrong2.top/uploads/image/20210329/606190226c0b3.png
                 * balance_rate : 1.00
                 * type : 1
                 * shop_id : 0
                 * updatetime : 0
                 * allparent : 22,0
                 * allson : 24
                 * child_count : 0
                 */

                private String id;
                private String name;
                private String pid;
                private String type_id;
                @SerializedName("class")
                private String classX;
                private String is_home;
                private String is_online_buy;
                private String sort;
                private String status;
                private String seotitle;
                private String seokeywords;
                private String seodescription;
                private String measure_unit;
                private String show_in_nav;
                private String grade;
                private String price;
                private String icon;
                private String img;
                private String balance_rate;
                private String type;
                private String shop_id;
                private String updatetime;
                private String allparent;
                private String allson;
                private int child_count;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPid() {
                    return pid;
                }

                public void setPid(String pid) {
                    this.pid = pid;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getIs_home() {
                    return is_home;
                }

                public void setIs_home(String is_home) {
                    this.is_home = is_home;
                }

                public String getIs_online_buy() {
                    return is_online_buy;
                }

                public void setIs_online_buy(String is_online_buy) {
                    this.is_online_buy = is_online_buy;
                }

                public String getSort() {
                    return sort;
                }

                public void setSort(String sort) {
                    this.sort = sort;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getSeotitle() {
                    return seotitle;
                }

                public void setSeotitle(String seotitle) {
                    this.seotitle = seotitle;
                }

                public String getSeokeywords() {
                    return seokeywords;
                }

                public void setSeokeywords(String seokeywords) {
                    this.seokeywords = seokeywords;
                }

                public String getSeodescription() {
                    return seodescription;
                }

                public void setSeodescription(String seodescription) {
                    this.seodescription = seodescription;
                }

                public String getMeasure_unit() {
                    return measure_unit;
                }

                public void setMeasure_unit(String measure_unit) {
                    this.measure_unit = measure_unit;
                }

                public String getShow_in_nav() {
                    return show_in_nav;
                }

                public void setShow_in_nav(String show_in_nav) {
                    this.show_in_nav = show_in_nav;
                }

                public String getGrade() {
                    return grade;
                }

                public void setGrade(String grade) {
                    this.grade = grade;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public String getBalance_rate() {
                    return balance_rate;
                }

                public void setBalance_rate(String balance_rate) {
                    this.balance_rate = balance_rate;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getShop_id() {
                    return shop_id;
                }

                public void setShop_id(String shop_id) {
                    this.shop_id = shop_id;
                }

                public String getUpdatetime() {
                    return updatetime;
                }

                public void setUpdatetime(String updatetime) {
                    this.updatetime = updatetime;
                }

                public String getAllparent() {
                    return allparent;
                }

                public void setAllparent(String allparent) {
                    this.allparent = allparent;
                }

                public String getAllson() {
                    return allson;
                }

                public void setAllson(String allson) {
                    this.allson = allson;
                }

                public int getChild_count() {
                    return child_count;
                }

                public void setChild_count(int child_count) {
                    this.child_count = child_count;
                }
            }
        }

        public static class ScreenListBean {
            /**
             * screen_order : 6
             * name : 爆品
             */

            private String screen_order;
            private String name;

            public String getScreen_order() {
                return screen_order;
            }

            public void setScreen_order(String screen_order) {
                this.screen_order = screen_order;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class OrderListBean {
            /**
             * order :
             * name : 默认排序
             */

            private String order;
            private String name;

            public String getOrder() {
                return order;
            }

            public void setOrder(String order) {
                this.order = order;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class DrageListBean {
            /**
             * id : 23
             * name : 女装
             */

            private String id;
            private String name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}

