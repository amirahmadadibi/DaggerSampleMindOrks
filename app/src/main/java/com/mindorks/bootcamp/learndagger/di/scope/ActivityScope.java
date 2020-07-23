package com.mindorks.bootcamp.learndagger.di.scope;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Scope//any component must have scope, ApplicationComponent has singleton scope
//we just create hypercritical scope, any say everything that hast this scope belongs to this
//scope
@Retention(RetentionPolicy.SOURCE)
public @interface ActivityScope {
}
