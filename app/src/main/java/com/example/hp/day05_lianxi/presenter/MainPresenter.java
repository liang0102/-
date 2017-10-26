package com.example.hp.day05_lianxi.presenter;

import com.example.hp.day05_lianxi.model.biz.IMainModel;
import com.example.hp.day05_lianxi.model.biz.MainModel;
import com.example.hp.day05_lianxi.model.entity.MyBean;
import com.example.hp.day05_lianxi.model.net.callback.INetWorkCallback;
import com.example.hp.day05_lianxi.view.IMainView;

import java.util.List;

/**
 * Created by HP on 2017/10/25.
 */
public class MainPresenter implements IMainPresenter {
    private IMainModel mainModel;
    private IMainView mainView;

    public MainPresenter(IMainView mainView) {
        this.mainModel = new MainModel();
        this.mainView = mainView;
    }

    @Override
    public void homeData() {
        mainView.showProgressDialog();
        mainModel.homeData(new INetWorkCallback<MyBean>() {
            @Override
            public void onSuccess(MyBean myBean) {
                mainView.loadMore(myBean.getResult().getList());
                mainView.dismiss();
            }

            @Override
            public void onError(String errorMsg) {
                mainView.showMsg(errorMsg);
                mainView.dismiss();
            }
        });
    }

    @Override
    public void refresh() {
        mainView.showProgressDialog();
        mainModel.homeData(new INetWorkCallback<MyBean>() {
            @Override
            public void onSuccess(MyBean myBean) {
                List<MyBean.ResultMyBean.ListMyBean> list = myBean.getResult().getList();
                mainView.refresh(list);
                mainView.dismiss();
            }

            @Override
            public void onError(String errorMsg) {
                mainView.dismiss();
                mainView.showMsg(errorMsg);
            }
        });
    }

    @Override
    public void loadMore() {
        mainView.showProgressDialog();
        mainModel.homeData(new INetWorkCallback<MyBean>() {
            @Override
            public void onSuccess(MyBean myBean) {
                List<MyBean.ResultMyBean.ListMyBean> list = myBean.getResult().getList();
                mainView.loadMore(list);
                mainView.dismiss();
            }

            @Override
            public void onError(String errorMsg) {
                mainView.dismiss();
                mainView.showMsg(errorMsg);
            }
        });
    }
}
