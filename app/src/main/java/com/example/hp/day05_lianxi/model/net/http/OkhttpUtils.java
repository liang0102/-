package com.example.hp.day05_lianxi.model.net.http;

import com.example.hp.day05_lianxi.app.APP;
import com.example.hp.day05_lianxi.model.net.callback.INetWorkCallback;
import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by HP on 2017/10/25.
 */
public class OkhttpUtils implements IHttp{
    private static OkhttpUtils okhttpUtils;

    private OkHttpClient okHttpClient;

    private OkhttpUtils(){
        okHttpClient = new OkHttpClient.Builder().build();
    }

    public static OkhttpUtils getInstance(){
        if(okhttpUtils == null){
            synchronized (OkhttpUtils.class){
                if(okhttpUtils == null){
                    okhttpUtils = new OkhttpUtils();
                }
            }
        }
        return okhttpUtils;
    }

    @Override
    public <T> void get(String url, final INetWorkCallback<T> callback) {
        Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String jsonData = response.body().string();
                APP.context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callback.onSuccess(getGeneric(jsonData,callback));
                    }
                });
            }
        });
    }

    private <T> T getGeneric(String jsonData,INetWorkCallback<T> callBack){
        Gson gson = new Gson();
        //通过反射获取泛型的实例
        Type[] types = callBack.getClass().getGenericInterfaces();//得到这个类所实现的所有接口的集合
        Type[] actualTypeArguments = ((ParameterizedType) types[0]).getActualTypeArguments();//获取该接口中所有的参数
        Type type = actualTypeArguments[0];//取第一个参数，就是对应JavaBean
        T t = gson.fromJson(jsonData,type);//通过gson转到对应的JavaBean
        return t;
    }
}
