package com.example.hp.day05_lianxi.model.net.http;

/**
 * Created by HP on 2017/10/25.
 */
public class HttpFactory {
    public static IHttp create(){
        return OkhttpUtils.getInstance();
    }
}
