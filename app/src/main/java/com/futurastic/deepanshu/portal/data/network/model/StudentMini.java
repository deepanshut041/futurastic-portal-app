package com.futurastic.deepanshu.portal.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by deepanshu on 27/3/18.
 */

public class StudentMini {

    @Expose
    @SerializedName("id")
    private int id;

    @Expose
    @SerializedName("first_name")
    private String firstName;

    @Expose
    @SerializedName("last_name")
    private String lastName;

    @Expose
    @SerializedName("phone_no")
    private Long phoneNumber;

    @Expose
    @SerializedName("date_of_birth")
    private int dob;

    @Expose
    @SerializedName("father_name")
    private int fatherName;

    @Expose
    @SerializedName("mother_name")
    private int motherName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getFatherName() {
        return fatherName;
    }

    public void setFatherName(int fatherName) {
        this.fatherName = fatherName;
    }

    public int getMotherName() {
        return motherName;
    }

    public void setMotherName(int motherName) {
        this.motherName = motherName;
    }
}
