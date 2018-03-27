package com.futurastic.deepanshu.portal.ui.setting;

import com.futurastic.deepanshu.portal.data.DataManager;
import com.futurastic.deepanshu.portal.ui.base.MvpPresenterImpl;

import javax.inject.Inject;

/**
 * Created by deepanshu on 16/3/18.
 */

public class SettingPresenter<V extends SettingMvpView> extends MvpPresenterImpl<V>
        implements SettingMvpPresenter<V> {

    @Inject
    public SettingPresenter(DataManager dataManager) {
        super(dataManager);
    }
}
