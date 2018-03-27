package com.futurastic.deepanshu.portal.data;

import com.futurastic.deepanshu.portal.data.db.DbHelper;
import com.futurastic.deepanshu.portal.data.db.model.User;
import com.futurastic.deepanshu.portal.data.network.ApiHeader;
import com.futurastic.deepanshu.portal.data.network.ApiHelper;
import com.futurastic.deepanshu.portal.data.network.model.AttendanceModel;
import com.futurastic.deepanshu.portal.data.network.model.StudentSession;
import com.futurastic.deepanshu.portal.data.prefs.PreferencesHelper;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;

/**
 * Created by deepanshu on 16/3/18.
 */

public class AppDataManager implements DataManager {
    private final DbHelper mDbHelper;
    private final PreferencesHelper mPreferencesHelper;
    private final ApiHelper mApiHelper;

    public AppDataManager(DbHelper dbHelper, PreferencesHelper preferencesHelper, ApiHelper apiHelper) {
        mDbHelper = dbHelper;
        mPreferencesHelper = preferencesHelper;
        mApiHelper = apiHelper;
    }

    @Override
    public ApiHeader getApiHeader() {
        return mApiHelper.getApiHeader();
    }

    @Override
    public Single<StudentSession> getStudentSession() {
        return null;
    }

    @Override
    public Single<AttendanceModel> postAttendance(List<AttendanceModel> attendanceModel) {
        return null;
    }

    @Override
    public void setApiHeader(ApiHeader apiHeader) {
        mApiHelper.setApiHeader(apiHeader);
    }

    @Override
    public String getAccessToken() {
        return mPreferencesHelper.getAccessToken();
    }

    @Override
    public void setAccessToken(String accessToken) {
        mPreferencesHelper.setAccessToken(accessToken);
        mApiHelper.getApiHeader().setAccessToken(accessToken);
    }


    @Override
    public Observable<Long> insertUser(User user) {
        return null;
    }

    @Override
    public Observable<List<User>> getAllUsers() {
        return null;
    }
}
