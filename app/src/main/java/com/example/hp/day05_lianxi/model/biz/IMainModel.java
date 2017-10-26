package com.example.hp.day05_lianxi.model.biz;

import com.example.hp.day05_lianxi.model.entity.MyBean;
import com.example.hp.day05_lianxi.model.net.callback.INetWorkCallback;

/**
 * Created by HP on 2017/10/25.
 */
public interface IMainModel {
   void homeData(INetWorkCallback<MyBean> callback);
}
