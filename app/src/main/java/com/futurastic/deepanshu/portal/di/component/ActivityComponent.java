package com.futurastic.deepanshu.portal.di.component;

import com.futurastic.deepanshu.portal.ui.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by deepanshu on 16/3/18.
 */

@Singleton
@Component
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
