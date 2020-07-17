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

    @Provides
    MainViewModel provideMainViewModel() {
        return new MainViewModel(new DatabaseService(activity.getApplication(), "test", 1)
                , new NetworkService(activity.getApplication(), "xby"));
    }
}
