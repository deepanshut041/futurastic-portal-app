package com.futurastic.deepanshu.portal.ui.main;

import com.futurastic.deepanshu.portal.data.DataManager;
import com.futurastic.deepanshu.portal.ui.base.MvpPresenterImpl;

import javax.inject.Inject;

/**
 * Created by deepanshu on 16/3/18.
 */

public class MainPresenter<V extends MainMvpView> extends MvpPresenterImpl<V>
        implements MainMvpPresenter<V> {

    private static final String TAG = MainPresenter.class.getSimpleName();

    @Inject
    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void onDrawerOptionSettingsClick() {
        getMvpView().showSettingFragment();
    }

    @Override
    public void onDrawerOptionLogoutClick() {
    }

    @Override
    public String getUser() {
        return null;
    }


}
