package com.mindorks.bootcamp.learndagger.ui;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;

import javax.inject.Inject;

public class MainViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;


    //we can provide dependencies like this
    //we this inject we dont need provide method in module
    //dagger with get constructor input throhg other moudles
    @Inject//tells dagger we want this and dagger will try to provide these instances-network and database
    public MainViewModel(DatabaseService databaseService, NetworkService networkService) {
        this.databaseService = databaseService;
        this.networkService = networkService;
    }

    public String getSomeData() {
        return databaseService.getDummyData() + " : " + networkService.getDummyData();
    }
}
