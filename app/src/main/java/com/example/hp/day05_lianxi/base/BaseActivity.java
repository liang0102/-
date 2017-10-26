package com.example.hp.day05_lianxi.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.hp.day05_lianxi.app.APP;

/**
 * Created by HP on 2017/10/25.
 */
public abstract class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayouId());
        APP.context = this;
        init();
        loadData();
    }

    protected abstract int getLayouId();

    protected abstract void init();

    protected abstract void loadData();
}
