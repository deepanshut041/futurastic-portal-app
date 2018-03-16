package com.futurastic.deepanshu.portal.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.futurastic.deepanshu.portal.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by deepanshu on 16/3/18.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }
}
