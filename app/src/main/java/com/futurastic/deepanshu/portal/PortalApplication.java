package com.futurastic.deepanshu.portal;

import android.app.Application;
import android.content.Context;

import com.futurastic.deepanshu.portal.data.DataManager;
import com.futurastic.deepanshu.portal.di.component.ApplicationComponent;
import com.futurastic.deepanshu.portal.di.module.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by deepanshu on 28/3/18.
 */

public class PortalApplication extends Application {

    protected ApplicationComponent applicationComponent;


    @Inject
    DataManager dataManager;


    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        applicationComponent = applicationComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
