package com.futurastic.deepanshu.portal.data.network;

import com.futurastic.deepanshu.portal.BuildConfig;

/**
 * Created by deepanshu on 16/3/18.
 */

public final class ApiEndPoint {

    public static final String USER_LOGIN = BuildConfig.BASE_URL
            + "/auth/login/";

    public static final String USER_ATTENDANCE = BuildConfig.BASE_URL
            + "/api/v1/attendence/student/";

    public static final String STUDENT_SESSION_LIST = BuildConfig.BASE_URL
            + "/api/v1/session/student/student_detail";

    private ApiEndPoint() {
        // This class is not publicly instantiable
    }
}
