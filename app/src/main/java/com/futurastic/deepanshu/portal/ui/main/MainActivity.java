package com.futurastic.deepanshu.portal.ui.main;

import android.os.Bundle;

import com.futurastic.deepanshu.portal.R;
import com.futurastic.deepanshu.portal.ui.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActivityComponent().inject(this);
    }
}
