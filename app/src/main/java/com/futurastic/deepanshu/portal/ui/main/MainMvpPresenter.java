package com.futurastic.deepanshu.portal.ui.main;

import com.futurastic.deepanshu.portal.di.PerActivity;
import com.futurastic.deepanshu.portal.ui.base.MvpPresenter;

/**
 * Created by deepanshu on 16/3/18.
 */

@PerActivity
public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {
}
