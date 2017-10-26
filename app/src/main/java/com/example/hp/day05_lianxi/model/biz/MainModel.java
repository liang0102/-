package com.example.hp.day05_lianxi.model.biz;

import com.example.hp.day05_lianxi.config.Urls;
import com.example.hp.day05_lianxi.model.entity.MyBean;
import com.example.hp.day05_lianxi.model.net.callback.INetWorkCallback;
import com.example.hp.day05_lianxi.model.net.http.HttpFactory;

/**
 * Created by HP on 2017/10/25.
 */
public class MainModel implements IMainModel {

    @Override
    public void homeData(INetWorkCallback<MyBean> callback) {
        HttpFactory.create().get(Urls.URL, callback);
    }
}
