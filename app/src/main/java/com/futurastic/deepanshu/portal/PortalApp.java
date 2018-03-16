package com.futurastic.deepanshu.portal;

import android.app.Application;

import com.futurastic.deepanshu.portal.data.DataManager;

import javax.inject.Inject;

/**
 * Created by deepanshu on 16/3/18.
 */

public class PortalApp extends Application {

    @Inject
    DataManager mDataManager;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
