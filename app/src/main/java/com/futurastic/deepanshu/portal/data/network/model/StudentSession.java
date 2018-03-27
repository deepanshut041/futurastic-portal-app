package com.futurastic.deepanshu.portal.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by deepanshu on 27/3/18.
 */

public class StudentSession {
    @Expose
    @SerializedName("id")
    private int id;

    @Expose
    @SerializedName("student")
    private StudentMini student;

    @Expose
    @SerializedName("session")
    private int session;

    @Expose
    @SerializedName("enrolled_at")
    private int enrolled_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StudentMini getStudent() {
        return student;
    }

    public void setStudent(StudentMini student) {
        this.student = student;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public int getEnrolled_at() {
        return enrolled_at;
    }

    public void setEnrolled_at(int enrolled_at) {
        this.enrolled_at = enrolled_at;
    }
}
