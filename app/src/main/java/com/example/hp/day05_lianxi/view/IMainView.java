package com.example.hp.day05_lianxi.view;

import com.example.hp.day05_lianxi.model.entity.MyBean;

import java.util.List;

/**
 * Created by HP on 2017/10/25.
 */
public interface IMainView {
    void refresh(List<MyBean.ResultMyBean.ListMyBean> list);

    void loadMore(List<MyBean.ResultMyBean.ListMyBean> list);

    void showMsg(String msg);

    void showProgressDialog();

    void dismiss();
}
