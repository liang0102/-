package com.example.hp.day05_lianxi.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;
import com.example.hp.day05_lianxi.R;
import com.example.hp.day05_lianxi.model.entity.MyBean;

import java.util.List;

/**
 * Created by HP on 2017/10/25.
 */
public class RecyclerAdapter extends BaseAdapter<MyBean.ResultMyBean.ListMyBean> {

    public RecyclerAdapter(Context context, List<MyBean.ResultMyBean.ListMyBean> datas) {
        super(context, R.layout.recyc_item, datas);
    }


    @Override
    public void convert(ViewHolder holder, MyBean.ResultMyBean.ListMyBean listMyBean) {
        ImageView image = holder.getView(R.id.Item_Image);
        Glide.with(context).load(listMyBean.getFirstImg()).into(image);
        holder.setText(R.id.Item_Title, listMyBean.getTitle());
    }
}
