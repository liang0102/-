package com.example.hp.day05_lianxi.model.net.http;

import com.example.hp.day05_lianxi.model.net.callback.INetWorkCallback;

/**
 * Created by HP on 2017/10/25.
 */
public interface IHttp {
    <T> void get(String url, INetWorkCallback<T> callback);
}
