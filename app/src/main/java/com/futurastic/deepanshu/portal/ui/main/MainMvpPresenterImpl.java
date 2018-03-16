package com.futurastic.deepanshu.portal.ui.main;

import com.futurastic.deepanshu.portal.data.DataManager;
import com.futurastic.deepanshu.portal.ui.base.MvpPresenterImpl;

import javax.inject.Inject;

/**
 * Created by deepanshu on 16/3/18.
 */

public class MainMvpPresenterImpl<V extends MainMvpView> extends MvpPresenterImpl<V>
        implements MainMvpPresenter<V> {

    @Inject
    public MainMvpPresenterImpl(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);
    }


}
