package com.futurastic.deepanshu.portal.di.component;

import android.app.Application;
import android.content.Context;

import com.futurastic.deepanshu.portal.PortalApp;
import com.futurastic.deepanshu.portal.di.ApplicationContext;
import com.futurastic.deepanshu.portal.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by deepanshu on 13/3/18.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(PortalApp app);

//    void inject(SyncService service);

    @ApplicationContext
    Context context();

    Application application();

//    DataManager getDataManager();
}
