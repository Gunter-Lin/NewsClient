package com.guitian.newsforall.ui.news.contract;

import com.guitian.newsforall.bean.NewsDetail;
import com.guitian.common.base.BaseModel;
import com.guitian.common.base.BasePresenter;
import com.guitian.common.base.BaseView;

import rx.Observable;

/**
 * des:新闻详情contract
 * Created by xsf
 * on 2016.09.14:38
 */
public interface NewsDetailContract {
    interface Model extends BaseModel {
        //请求获取新闻
        Observable <NewsDetail> getOneNewsData(String postId);
    }

    interface View extends BaseView {
        //返回获取的新闻
        void returnOneNewsData(NewsDetail newsDetail);
    }
    abstract static class Presenter extends BasePresenter<View, Model> {
        //发起获取单条新闻请求
        public abstract void getOneNewsDataRequest(String postId);
    }
}
