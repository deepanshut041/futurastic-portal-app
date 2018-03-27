package com.futurastic.deepanshu.portal.data.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.futurastic.deepanshu.portal.data.db.models.AttendanceModel;

import java.util.List;

/**
 * Created by deepanshu on 28/3/18.
 */

@Dao
public interface AttendanceDao {

    @Query("SELECT * FROM attendance")
    List<AttendanceModel> getAll();

    @Query("SELECT * FROM attendance WHERE is_updated = 0")
    List<AttendanceModel> getAllUnsynced();

    @Query("SELECT * FROM attendance WHERE is_updated = 1")
    List<AttendanceModel> getAllSynced();

    @Query("SELECT * FROM attendance WHERE attended = 1")
    List<AttendanceModel> getAllPresent();

    @Query("SELECT * FROM attendance WHERE attended = 0")
    List<AttendanceModel> getAllAbsent();

    @Query("SELECT COUNT(*) from attendance")
    int countUsers();

    @Insert
    void insertAll(AttendanceModel... attendanceModels);

    @Update
    void update(AttendanceModel attendanceModel);

    @Update
    void updateMultiple(AttendanceModel... attendanceModels);

    @Delete
    void delete(AttendanceModel user);

    @Delete
    void deleteMultiple(AttendanceModel... attendanceModels);

}
