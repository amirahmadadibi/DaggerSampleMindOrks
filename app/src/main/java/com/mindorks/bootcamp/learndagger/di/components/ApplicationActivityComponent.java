package com.mindorks.bootcamp.learndagger.di.components;


import com.mindorks.bootcamp.learndagger.di.modules.ActivityModule;
import com.mindorks.bootcamp.learndagger.di.scope.ActivityScope;
import com.mindorks.bootcamp.learndagger.ui.MainActivity;

import dagger.Component;

//in acitivty module we use database and network service one of our method input
//so we have these two az dependency for our module
//i just want to say, hey component your module needs some dependencies
//so go and get them from another component that has them like dependencies = {ApplicationComponent.class
//and know we cant share dependencies between components
//because application component use singleton for everything and activity module not, we get scope error
//and need to use scope and create activity scope
@ActivityScope
@Component(dependencies = {ApplicationComponent.class}, modules = {ActivityModule.class})
public interface ApplicationActivityComponent {
    void inject(MainActivity mainActivity);
}
