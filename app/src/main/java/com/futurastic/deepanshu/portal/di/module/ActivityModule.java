package com.futurastic.deepanshu.portal.di.module;

import android.app.Activity;
import android.content.Context;

import com.futurastic.deepanshu.portal.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by deepanshu on 28/3/18.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}