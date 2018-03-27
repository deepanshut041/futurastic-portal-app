package com.futurastic.deepanshu.portal.data;

import com.futurastic.deepanshu.portal.data.db.DbHelper;
import com.futurastic.deepanshu.portal.data.network.ApiHelper;
import com.futurastic.deepanshu.portal.data.prefs.PreferencesHelper;

/**
 * Created by deepanshu on 16/3/18.
 */

public interface DataManager extends DbHelper, PreferencesHelper, ApiHelper {
}
