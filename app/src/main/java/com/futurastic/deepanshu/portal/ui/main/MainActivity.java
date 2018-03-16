package com.futurastic.deepanshu.portal.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.futurastic.deepanshu.portal.R;
import com.futurastic.deepanshu.portal.ui.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity  implements MainMvpView {

    @Inject
    MainMvpPresenter<MainMvpView> mPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActivityComponent().inject(this);

        mPresenter.onAttach(MainActivity.this);
    }

    @Override
    public void openActivityOnTokenExpire() {

    }

    @Override
    public void hideKeyboard() {

    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }
}
