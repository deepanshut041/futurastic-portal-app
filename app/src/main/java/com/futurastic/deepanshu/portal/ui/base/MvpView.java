package com.futurastic.deepanshu.portal.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by deepanshu on 16/3/18.
 */

public interface MvpView {

    void showLoading();

    void hideLoading();

    void openActivityOnTokenExpire();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();
}
