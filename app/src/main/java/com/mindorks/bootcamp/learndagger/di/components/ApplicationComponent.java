package com.mindorks.bootcamp.learndagger.di.components;


import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;


//@Component is dependency manager - is in the middle between class and module
//take module's that needs to provide instances
//component searchs for module witch can provides the instances
//Dagger will create a class with the name of this interface and adds Dagger in front of it
//so crates class DaggerApplicationComponent and implement this interface on it

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    //you can call it supply or inject
    //by passing application to inject method of this interface
    //we tell dagger hay MyApplication class needs dependencies
    //scan that class
    void inject(MyApplication application);

    //we want to provide application module created staff for other components
    //so we have to create method in it's component -> here
    NetworkService getNetworkService();
    DatabaseService getDatabaseService();
}
