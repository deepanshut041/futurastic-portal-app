package com.futurastic.deepanshu.portal.di.module;

import android.app.Service;

import dagger.Module;

/**
 * Created by deepanshu on 13/3/18.
 */


@Module
public class ServiceModule {

    private final Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }
}