package com.futurastic.deepanshu.portal.data.db;

import com.futurastic.deepanshu.portal.data.db.model.User;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by deepanshu on 16/3/18.
 */

public interface DbHelper {

    Observable<Long> insertUser(final User user);

    Observable<List<User>> getAllUsers();
}
