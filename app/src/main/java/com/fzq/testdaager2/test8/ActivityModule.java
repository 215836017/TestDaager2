package com.fzq.testdaager2.test8;


import dagger.Module;
import dagger.Provides;

/**
 * Created by fzq on 2017/12/20.
 */

@Module
public class ActivityModule {

    private TestActivity8 activity;

    public ActivityModule(TestActivity8 activity) {
        this.activity = activity;
    }

    @Provides
    public TestActivity8 provideActivity(){
        return activity;
    }

    @Provides
    public User provideUser(){
        return new User("user form ActivityModule");
    }

    @Provides
    public DaggerPresenter provideDaggerPresenter(TestActivity8 activity, User user){
        return new DaggerPresenter(activity, user);
    }
}
