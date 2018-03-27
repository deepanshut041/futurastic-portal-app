package com.futurastic.deepanshu.portal.data.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.futurastic.deepanshu.portal.data.db.models.AttendanceModel;

/**
 * Created by deepanshu on 28/3/18.
 */

@Database(entities = {AttendanceModel.class}, version = 1, exportSchema = false)
public abstract class DbHelper extends RoomDatabase {
    public abstract AttendanceDao attendanceDao();

}
