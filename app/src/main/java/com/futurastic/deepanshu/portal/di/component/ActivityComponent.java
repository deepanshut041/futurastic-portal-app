package com.futurastic.deepanshu.portal.di.component;

import com.futurastic.deepanshu.portal.MainActivity;
import com.futurastic.deepanshu.portal.di.PerActivity;
import com.futurastic.deepanshu.portal.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by deepanshu on 28/3/18.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
