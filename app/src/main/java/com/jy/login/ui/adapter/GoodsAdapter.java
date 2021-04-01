package com.jy.login.ui.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jy.login.R;
import com.jy.login.base.BaseAdapter;
import com.jy.login.model.bean.GoodsBean;

import java.util.List;

public class GoodsAdapter extends BaseAdapter {

    Context context;

    public GoodsAdapter(List mData, Context context) {
        super(mData, context);
        this.context = context;
    }

    @Override
    protected int getLayout() {
        return R.layout.item_goods;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        GoodsBean.DataBean.YRinitlistBean._$10Bean.ContentBean.GoodslistBean bean = (GoodsBean.DataBean.YRinitlistBean._$10Bean.ContentBean.GoodslistBean) data;

        ImageView img = (ImageView) vh.getViewByid(R.id.img);
        TextView tvTitle = (TextView) vh.getViewByid(R.id.tv_title);
        TextView tvMoney = (TextView) vh.getViewByid(R.id.tv_money);

        Glide.with(context).load(bean.getImg()).into(img);
        tvTitle.setText(bean.getTitle());
        tvMoney.setText(bean.getPrice());
    }
}
