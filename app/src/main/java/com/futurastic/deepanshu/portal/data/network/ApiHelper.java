package com.futurastic.deepanshu.portal.data.network;

import com.futurastic.deepanshu.portal.data.network.model.AttendanceModel;
import com.futurastic.deepanshu.portal.data.network.model.StudentSession;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by deepanshu on 16/3/18.
 */

public interface ApiHelper {

    ApiHeader getApiHeader();

    Single<StudentSession> getStudentSession();

    Single<AttendanceModel> postAttendance(List<AttendanceModel> attendanceModel);

    void setApiHeader(ApiHeader apiHeader);
}
