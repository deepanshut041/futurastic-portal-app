package com.futurastic.deepanshu.portal.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by deepanshu on 16/3/18.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
