package com.mindorks.bootcamp.learndagger.data.local;

import android.content.Context;

import javax.inject.Inject;

/**
 * Dummy class to simulate the actual Database using Room or Realm etc
 */
public class DatabaseService {

    private Context context;
    private String databaseName;
    private int version;

    @Inject
    public DatabaseService(Context context, String databaseName, int version) {
        // do the initialisation here
        this.context = context;
        this.databaseName = databaseName;
        this.version = version;
    }

    public String getDummyData() {
        return "DATABASE_DUMMY_DATA";
    }
}
