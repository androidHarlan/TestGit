package com.lingbao.testgit;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by a1 on 2017/6/22.
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.init(this);
        JPushInterface.setDebugMode(true);
    }
}
