package com.example.hp.day05_lianxi.model.net.callback;

/**
 * Created by HP on 2017/10/25.
 */
public interface INetWorkCallback<T> {
    void onSuccess(T t);

    void onError(String errorMsg);
}
