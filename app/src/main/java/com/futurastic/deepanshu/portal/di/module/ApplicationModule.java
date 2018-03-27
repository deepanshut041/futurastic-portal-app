package com.futurastic.deepanshu.portal.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.futurastic.deepanshu.portal.di.ApplicationContext;
import com.futurastic.deepanshu.portal.di.DatabaseInfo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by deepanshu on 28/3/18.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application app) {
        mApplication = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }
}
