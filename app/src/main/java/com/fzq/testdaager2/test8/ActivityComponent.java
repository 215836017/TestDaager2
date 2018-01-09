package com.fzq.testdaager2.test8;


import dagger.Component;

/**
 * Created by fzq on 2017/12/20.
 */

@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(TestActivity8 daggerActivity);
}
