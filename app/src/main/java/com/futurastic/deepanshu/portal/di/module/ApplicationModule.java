package com.futurastic.deepanshu.portal.di.module;

import android.app.Application;
import android.content.Context;

import com.futurastic.deepanshu.portal.data.DataManager;
import com.futurastic.deepanshu.portal.data.DataManagerImpl;
import com.futurastic.deepanshu.portal.data.db.DbHelper;
import com.futurastic.deepanshu.portal.data.db.DbHelperImpl;
import com.futurastic.deepanshu.portal.data.network.ApiHelper;
import com.futurastic.deepanshu.portal.data.network.ApiHelperImpl;
import com.futurastic.deepanshu.portal.data.prefs.PreferencesHelper;
import com.futurastic.deepanshu.portal.data.prefs.PreferencesHelperImpl;
import com.futurastic.deepanshu.portal.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by deepanshu on 16/3/18.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
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

    @Singleton
    DataManager provideDataManager(DataManagerImpl appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(DbHelperImpl appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(PreferencesHelperImpl appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(ApiHelperImpl appApiHelper) {
        return appApiHelper;
    }
}
