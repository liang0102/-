package com.example.hp.day05_lianxi.view;

import android.app.ProgressDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import com.androidkun.PullToRefreshRecyclerView;
import com.androidkun.callback.PullToRefreshListener;
import com.example.hp.day05_lianxi.R;
import com.example.hp.day05_lianxi.adapter.RecyclerAdapter;
import com.example.hp.day05_lianxi.base.BaseActivity;
import com.example.hp.day05_lianxi.model.entity.MyBean;
import com.example.hp.day05_lianxi.presenter.IMainPresenter;
import com.example.hp.day05_lianxi.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements IMainView {


    private ProgressDialog dialog;
    private PullToRefreshRecyclerView Recycler;
    private IMainPresenter mainPresenter;
    private RecyclerAdapter adapter;
    private List<MyBean.ResultMyBean.ListMyBean> list;

    @Override
    protected int getLayouId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        this.mainPresenter = new MainPresenter(this);
        this.list = new ArrayList<>();
        adapter = new RecyclerAdapter(this, list);
        Recycler = (PullToRefreshRecyclerView) findViewById(R.id.Recycler);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        Recycler.setLayoutManager(manager);
        Recycler.setPullRefreshEnabled(true);
        Recycler.setLoadingMoreEnabled(true);
        Recycler.setPullToRefreshListener(new PullToRefreshListener() {
            @Override
            public void onRefresh() {
                mainPresenter.refresh();
            }

            @Override
            public void onLoadMore() {
                mainPresenter.loadMore();
                Recycler.setLoadMoreComplete();
            }
        });
        Recycler.setAdapter(adapter);
    }

    @Override
    protected void loadData() {
        mainPresenter.homeData();
    }

    @Override
    public void refresh(List<MyBean.ResultMyBean.ListMyBean> list) {
        this.list.clear();
        this.list.addAll(list);
        adapter.notifyDataSetChanged();
        Recycler.setRefreshComplete();
    }

    @Override
    public void loadMore(List<MyBean.ResultMyBean.ListMyBean> list) {
        this.list.addAll(list);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void showMsg(String msg) {
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProgressDialog() {
        dialog = new ProgressDialog(this);
        dialog.show();
    }

    @Override
    public void dismiss() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
