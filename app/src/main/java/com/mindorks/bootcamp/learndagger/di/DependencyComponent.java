package com.mindorks.bootcamp.learndagger.di;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.ui.MainActivity;
import com.mindorks.bootcamp.learndagger.ui.MainViewModel;

public class DependencyComponent {

    public static void inject(MyApplication application) {
        application.networkService = new NetworkService(application, "SOME_API_KEY");
        application.databaseService = new DatabaseService(application, "dummy_db", 1);
    }

    public static void inject(MainActivity activity) {
        MyApplication app = (MyApplication) activity.getApplication();
//        activity.viewModel = new MainViewModel(app.databaseService, app.networkService);
    }
}
