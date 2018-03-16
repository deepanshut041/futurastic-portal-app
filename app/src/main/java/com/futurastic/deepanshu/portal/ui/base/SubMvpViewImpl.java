package com.futurastic.deepanshu.portal.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by deepanshu on 16/3/18.
 */

// It acts an service for rendering views on screen

public abstract class SubMvpViewImpl extends ViewGroup implements SubMvpView {

    private MvpView mParentMvpView;

    public SubMvpViewImpl(Context context) {
        super(context);
    }

    public SubMvpViewImpl(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SubMvpViewImpl(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    // Specifically to support for target version below than 21
    @TargetApi(21)
    public SubMvpViewImpl(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void attachParentMvpView(MvpView mvpView) {
        mParentMvpView = mvpView;
    }

    @Override
    public void showLoading() {
        if (mParentMvpView != null) {
            mParentMvpView.showLoading();
        }
    }

    @Override
    public void hideLoading() {
        if (mParentMvpView != null) {
            mParentMvpView.hideLoading();
        }
    }

    @Override
    public void onError(@StringRes int resId) {
        if (mParentMvpView != null) {
            mParentMvpView.onError(resId);
        }
    }

    @Override
    public void onError(String message) {
        if (mParentMvpView != null) {
            mParentMvpView.onError(message);
        }
    }

    @Override
    public void showMessage(String message) {
        if (mParentMvpView != null) {
            mParentMvpView.showMessage(message);
        }
    }

    @Override
    public void showMessage(@StringRes int resId) {
        if (mParentMvpView != null) {
            mParentMvpView.showMessage(resId);
        }
    }

    @Override
    public void hideKeyboard() {
        if (mParentMvpView != null) {
            mParentMvpView.hideKeyboard();
        }
    }

    @Override
    public boolean isNetworkConnected() {
        if (mParentMvpView != null) {
            return mParentMvpView.isNetworkConnected();
        }
        return false;
    }

    @Override
    public void openActivityOnTokenExpire() {
        if (mParentMvpView != null) {
            mParentMvpView.openActivityOnTokenExpire();
        }
    }

    protected abstract void bindViewsAndSetOnClickListeners();

    protected abstract void setUp();
}
