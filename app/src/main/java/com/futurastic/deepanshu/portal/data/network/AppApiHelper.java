package com.futurastic.deepanshu.portal.data.network;

import com.futurastic.deepanshu.portal.data.network.model.AttendanceModel;
import com.futurastic.deepanshu.portal.data.network.model.StudentSession;
import com.rx2androidnetworking.Rx2AndroidNetworking;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by deepanshu on 16/3/18.
 */

public class AppApiHelper implements ApiHelper{

    private ApiHeader mApiHeader;

    public AppApiHelper(ApiHeader apiHeader) {
        mApiHeader = apiHeader;
    }

    @Override
    public ApiHeader getApiHeader() {
        return mApiHeader;
    }

    @Override
    public Single<StudentSession> getStudentSession() {
        return Rx2AndroidNetworking.post(ApiEndPoint.STUDENT_SESSION_LIST)
                .addHeaders(mApiHeader.getAccessToken())
                .build()
                .getObjectSingle(StudentSession.class);
    }

    @Override
    public Single<AttendanceModel> postAttendance(List<AttendanceModel> attendanceModel) {
        return Rx2AndroidNetworking.post(ApiEndPoint.USER_ATTENDANCE)
                .addHeaders(mApiHeader.getAccessToken())
                .addBodyParameter(attendanceModel)
                .build()
                .getObjectSingle(AttendanceModel.class);
    }

    @Override
    public void setApiHeader(ApiHeader apiHeader) {
        this.mApiHeader = apiHeader;
    }

}
