package com.guitian.newsforall.ui.main.contract;

import com.guitian.newsforall.bean.NewsChannelTable;
import com.guitian.common.base.BaseModel;
import com.guitian.common.base.BasePresenter;
import com.guitian.common.base.BaseView;

import java.util.List;

import rx.Observable;

/**
 * des:
 * Created by xsf
 * on 2016.09.11:53
 */
public interface NewsMainContract {

    interface Model extends BaseModel {
        Observable< List<NewsChannelTable> > lodeMineNewsChannels();
    }

    interface View extends BaseView {
        //// TODO: 2017/5/18  what
        void returnMineNewsChannels(List<NewsChannelTable> newsChannelsMine);
    }
    abstract static class Presenter extends BasePresenter<View, Model> {
        public abstract void lodeMineChannelsRequest();
    }
}
