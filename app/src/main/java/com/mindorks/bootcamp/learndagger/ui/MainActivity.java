package com.mindorks.bootcamp.learndagger.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.mindorks.bootcamp.learndagger.R;
import com.mindorks.bootcamp.learndagger.di.DependencyComponent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    public MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DependencyComponent.inject(this);

        TextView tvData = findViewById(R.id.tvData);
//        tvData.setText(viewModel.getSomeData());
    }
}
