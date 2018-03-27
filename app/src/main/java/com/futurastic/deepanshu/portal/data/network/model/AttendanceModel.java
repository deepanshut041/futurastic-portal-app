package com.futurastic.deepanshu.portal.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by deepanshu on 27/3/18.
 */

public class AttendanceModel {

    @Expose
    @SerializedName("student")
    private int student_session;

    @Expose
    @SerializedName("attended")
    private boolean attended;

    @Expose
    @SerializedName("number")
    private String phoneNumber;

    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("data")
    private Date date;

    @Expose
    @SerializedName("modified_date")
    private Date modified_date;


    public AttendanceModel(){
    }

    public AttendanceModel(int student_session, boolean attended, Date date, Date modified_date) {
        this.student_session = student_session;
        this.attended = attended;
        this.date = date;
        this.modified_date = modified_date;
    }

    public AttendanceModel(int student_session, boolean attended, String phoneNumber, String name) {
        this.student_session = student_session;
        this.attended = attended;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public int getStudent_session() {
        return student_session;
    }

    public void setStudent_session(int student_session) {
        this.student_session = student_session;
    }

    public boolean isAttended() {
        return attended;
    }

    public void setAttended(boolean attended) {
        this.attended = attended;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }
}
