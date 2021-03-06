package com.mindorks.bootcamp.learndagger.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.R;
import com.mindorks.bootcamp.learndagger.di.components.DaggerApplicationActivityComponent;
import com.mindorks.bootcamp.learndagger.di.modules.ActivityModule;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerApplicationActivityComponent
                .builder()
                .activityModule(new ActivityModule(this))
                //we set applicationComponent as dependency for activity module
                .applicationComponent(((MyApplication) getApplication()).component)
                .build()
                .inject(this);

        TextView tvData = findViewById(R.id.tvData);
//        tvData.setText(viewModel.getSomeData());
    }
}
