package com.futurastic.deepanshu.portal.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.futurastic.deepanshu.portal.di.ActivityContext;
import com.futurastic.deepanshu.portal.di.PerActivity;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by deepanshu on 13/3/18.
 */

@Module
public class ActivityModule {
    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

//    @Provides
//    SchedulerProvider provideSchedulerProvider() {
//        return new AppSchedulerProvider();
//    }

//    @Provides
//    @PerActivity
//    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
//            SplashPresenter<SplashMvpView> presenter) {
//        return presenter;
//    }
}
