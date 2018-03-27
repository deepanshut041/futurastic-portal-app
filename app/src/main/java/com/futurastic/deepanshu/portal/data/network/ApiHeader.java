package com.futurastic.deepanshu.portal.data.network;

import com.futurastic.deepanshu.portal.data.db.DbHelper;
import com.futurastic.deepanshu.portal.data.prefs.PreferencesHelper;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by deepanshu on 16/3/18.
 */
@Singleton
public class ApiHeader {

    @Expose
    @SerializedName("Authorization")
    private String mAccessToken;

    @Expose
    @SerializedName("Content-Type")
    private String contentType;


    @Inject
    public ApiHeader(String dbHelper, PreferencesHelper preferencesHelper) {
        mAccessToken = preferencesHelper.getAccessToken();
    }

    public String getAccessToken() {
        return "JWT " + mAccessToken;
    }

    public void setAccessToken(String accessToken) {
        mAccessToken = accessToken;
    }

    public String getContentType() {
        return "application/json; charset=utf-8";
    }
}
