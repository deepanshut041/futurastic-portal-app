package com.futurastic.deepanshu.portal.di.component;

import com.futurastic.deepanshu.portal.di.PerService;
import com.futurastic.deepanshu.portal.di.module.ServiceModule;

import dagger.Component;

/**
 * Created by deepanshu on 13/3/18.
 */

@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {

//    void inject(SyncService service);

}