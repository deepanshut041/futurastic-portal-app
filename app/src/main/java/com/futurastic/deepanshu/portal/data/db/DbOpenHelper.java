package com.futurastic.deepanshu.portal.data.db;

import android.content.Context;

import com.futurastic.deepanshu.portal.di.ApplicationContext;
import com.futurastic.deepanshu.portal.di.DatabaseInfo;

import org.greenrobot.greendao.database.Database;

import javax.inject.Inject;

/**
 * Created by deepanshu on 14/3/18.
 */

public class DbOpenHelper extends DaoMaster.OpenHelper {

    @Inject
    public DbOpenHelper(@ApplicationContext Context context, @DatabaseInfo String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
        AppLogger.d("DEBUG", "DB_OLD_VERSION : " + oldVersion + ", DB_NEW_VERSION : " + newVersion);
        switch (oldVersion) {
            case 1:
            case 2:
                //db.execSQL("ALTER TABLE " + UserDao.TABLENAME + " ADD COLUMN "
                // + UserDao.Properties.Name.columnName + " TEXT DEFAULT 'DEFAULT_VAL'");
        }
    }

}
