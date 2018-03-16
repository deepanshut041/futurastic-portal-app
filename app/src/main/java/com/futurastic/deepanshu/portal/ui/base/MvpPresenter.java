package com.futurastic.deepanshu.portal.ui.base;

/**
 * Created by deepanshu on 16/3/18.
 */

public interface MvpPresenter<V extends MvpView> {
    void onAttach(V mvpView);

    void onDetach();
}
