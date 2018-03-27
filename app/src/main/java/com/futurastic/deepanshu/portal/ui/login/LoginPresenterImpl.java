package com.futurastic.deepanshu.portal.ui.login;

import com.futurastic.deepanshu.portal.data.DataManager;
import com.futurastic.deepanshu.portal.ui.base.MvpPresenterImpl;

import javax.inject.Inject;

/**
 * Created by deepanshu on 16/3/18.
 */

public class LoginPresenterImpl<V extends LoginMvpView> extends MvpPresenterImpl<V> implements LoginPresenter<V> {

    @Inject
    public LoginPresenterImpl(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);
    }

}
