package com.mindorks.bootcamp.learndagger.di.modules;


import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


//Module is provide recipe so called method to create instances for us
//create dependencies
@Module
public class ApplicationModule {

    private MyApplication application;

    //provide things to create dependencies
    public ApplicationModule(MyApplication application) {
        this.application = application;
    }


    //@Provide tell's dagger when we require this instances use this method and provide them for us
    @Singleton
    @Provides
    NetworkService provideNetworkService() {
        return new NetworkService(application, "key");
    }

    @Singleton
    @Provides
    DatabaseService provideDatabaseService() {
        return new DatabaseService(application, "databaseName.db", 1);
    }
}
