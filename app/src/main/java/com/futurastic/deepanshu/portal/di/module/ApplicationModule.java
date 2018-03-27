package com.futurastic.deepanshu.portal.di.module;

import android.app.Application;
import android.content.Context;

import com.futurastic.deepanshu.portal.data.DataManager;
import com.futurastic.deepanshu.portal.data.AppDataManager;
import com.futurastic.deepanshu.portal.data.db.DbHelper;
import com.futurastic.deepanshu.portal.data.db.AppDbHelper;
import com.futurastic.deepanshu.portal.data.network.ApiHeader;
import com.futurastic.deepanshu.portal.data.network.ApiHelper;
import com.futurastic.deepanshu.portal.data.network.AppApiHelper;
import com.futurastic.deepanshu.portal.data.prefs.PreferencesHelper;
import com.futurastic.deepanshu.portal.data.prefs.AppPreferencesHelper;
import com.futurastic.deepanshu.portal.di.ApplicationContext;
import com.futurastic.deepanshu.portal.di.PreferenceInfo;
import com.futurastic.deepanshu.portal.utils.AppConstants;

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
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @Singleton
    ApiHeader provideApiHeader(PreferencesHelper preferencesHelper) {
        return new ApiHeader(preferencesHelper.getAccessToken(), preferencesHelper);
    }


}
