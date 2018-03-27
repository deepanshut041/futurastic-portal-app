package com.futurastic.deepanshu.portal.di.component;

import android.app.Application;
import android.content.Context;

import com.futurastic.deepanshu.portal.PortalApplication;
import com.futurastic.deepanshu.portal.data.DataManager;
import com.futurastic.deepanshu.portal.data.db.DbHelper;
import com.futurastic.deepanshu.portal.data.prefs.SharedPrefsHelper;
import com.futurastic.deepanshu.portal.di.ApplicationContext;
import com.futurastic.deepanshu.portal.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by deepanshu on 28/3/18.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(PortalApplication portalApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
