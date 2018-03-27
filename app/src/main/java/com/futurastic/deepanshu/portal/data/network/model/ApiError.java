package com.futurastic.deepanshu.portal.data.network.model;

import com.futurastic.deepanshu.portal.data.db.DbHelper;
import com.futurastic.deepanshu.portal.data.prefs.PreferencesHelper;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.inject.Inject;

/**
 * Created by deepanshu on 16/3/18.
 */

public class ApiError {

    private int errorCode;

    @Expose
    @SerializedName("status_code")
    private String statusCode;

    @Expose
    @SerializedName("message")
    private String message;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
