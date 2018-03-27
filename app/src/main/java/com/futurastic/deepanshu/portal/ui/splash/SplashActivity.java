package com.futurastic.deepanshu.portal.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.futurastic.deepanshu.portal.R;
import com.futurastic.deepanshu.portal.ui.base.BaseActivity;
import com.futurastic.deepanshu.portal.ui.main.MainActivity;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements SplashMvpView {

    @Inject
    SplashPresenter<SplashMvpView> mPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getActivityComponent().inject(this);

        mPresenter.onAttach(SplashActivity.this);
    }

    @Override
    public void openLoginActivity() {
        new Handler(getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = LoginActivity.getStartIntent(SplashActivity.this);
                startActivity(intent);
                finish();
            }
        }, 800);
    }

    @Override
    public void openMainActivity() {
        new Handler(getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = MainActivity.getStartIntent(SplashActivity.this);
                startActivity(intent);
                finish();
            }
        }, 800);
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {

    }
}
