package com.futurastic.deepanshu.portal;

import android.app.Application;

import com.futurastic.deepanshu.portal.di.component.ApplicationComponent;
import com.futurastic.deepanshu.portal.di.module.ApplicationModule;

import java.util.logging.Level;

import javax.inject.Inject;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by deepanshu on 13/3/18.
 */

public class PortalApp extends Application {

//    @Inject
//    DataManager mDataManager;

    @Inject
    CalligraphyConfig mCalligraphyConfig;

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

//        mApplicationComponent = DaggerApplicationComponent.builder()
//                .applicationModule(new ApplicationModule(this)).build();
//
//        mApplicationComponent.inject(this);
//
//        AppLogger.init();
//
//        AndroidNetworking.initialize(getApplicationContext());
//        if (BuildConfig.DEBUG) {
//            AndroidNetworking.enableLogging(Level.BODY);
//        }

//        CalligraphyConfig.initDefault(mCalligraphyConfig);
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }

}
