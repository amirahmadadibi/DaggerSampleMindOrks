package com.mindorks.bootcamp.learndagger.di.modules;

import android.app.Activity;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.ui.MainViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }


    //when we use dagger and provide annotation, dagger will try to create everything that method need's
    //so dagger will create databaseService and networkService object because they are input of the method
    //if we run this we get error for dagger, dagger want's to inject dependencies an cant doing taht
    @Provides
    MainViewModel provideMainViewModel(DatabaseService databaseService, NetworkService networkService) {
        return new MainViewModel(databaseService, networkService);
    }

    //we do not want to create dependencies by our self like this blew sample
    //we already have module to crete database and network service so in above method
    //i use that for creating dependencies
    //@Provides
    //  MainViewModel provideMainViewModel() {
    //        return new MainViewModel(new DatabaseService(activity.getApplication(), "test", 1)
    //       , new NetworkService(activity.getApplication(), "xby"));
    //}
}
