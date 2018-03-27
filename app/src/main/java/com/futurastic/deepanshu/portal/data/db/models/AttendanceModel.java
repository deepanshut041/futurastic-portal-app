package com.futurastic.deepanshu.portal.data.db.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by deepanshu on 28/3/18.
 */

@Entity(tableName = "attendance")
public class AttendanceModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "student")
    private int studentSession;

    @ColumnInfo(name="attended")
    private boolean isPresent;

    @ColumnInfo(name="name")
    private String name;

    @ColumnInfo(name = "number")
    private String phoneNumber;

    @ColumnInfo(name="date")
    private Date date;

    @ColumnInfo(name="is_updated")
    private boolean isUpdated;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isUpdated() {
        return isUpdated;
    }

    public void setUpdated(boolean updated) {
        isUpdated = updated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentSession() {
        return studentSession;
    }

    public void setStudentSession(int studentSession) {
        this.studentSession = studentSession;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
