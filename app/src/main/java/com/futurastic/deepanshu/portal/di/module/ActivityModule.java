package com.futurastic.deepanshu.portal.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.futurastic.deepanshu.portal.di.ActivityContext;
import com.futurastic.deepanshu.portal.di.PerActivity;
import com.futurastic.deepanshu.portal.ui.login.LoginMvpView;
import com.futurastic.deepanshu.portal.ui.login.LoginPresenter;
import com.futurastic.deepanshu.portal.ui.main.MainMvpPresenter;
import com.futurastic.deepanshu.portal.ui.main.MainMvpView;
import com.futurastic.deepanshu.portal.ui.splash.SplashMvpView;
import com.futurastic.deepanshu.portal.ui.splash.SplashPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by deepanshu on 16/3/18.
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
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(MainMvpPresenter<MainMvpView> mvpPresenter){
        return mvpPresenter;
    }

    @Provides
    @PerActivity
    LoginPresenter<LoginMvpView> provideMainPresenter(LoginPresenter<LoginMvpView> mvpPresenter){
        return mvpPresenter;
    }

    @Provides
    @PerActivity
    SplashPresenter<SplashMvpView> provideMainPresenter(SplashPresenter<SplashMvpView> mvpPresenter){
        return mvpPresenter;
    }

}
