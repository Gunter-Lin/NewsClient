package com.guitian.newsforall.app;

import com.guitian.newsforall.BuildConfig;
import com.guitian.common.baseapp.BaseApplication;
import com.guitian.common.commonutils.LogUtils;

/**
 * APPLICATION
 */
public class AppApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化logger
        LogUtils.logInit(BuildConfig.LOG_DEBUG);
    }
}
