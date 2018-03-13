package com.futurastic.deepanshu.portal.di.module;

import android.app.Application;
import android.content.Context;

import com.futurastic.deepanshu.portal.di.ApplicationContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by deepanshu on 13/3/18.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
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
