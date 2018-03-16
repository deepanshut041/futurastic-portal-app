package com.futurastic.deepanshu.portal.di.component;

import android.app.Application;
import android.content.Context;

import com.futurastic.deepanshu.portal.PortalApp;
import com.futurastic.deepanshu.portal.data.DataManager;
import com.futurastic.deepanshu.portal.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by deepanshu on 16/3/18.
 */

@Singleton
@Component
public interface ApplicationComponent {

    void inject(PortalApp app);


    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}
