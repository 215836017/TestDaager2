package com.fzq.testdaager2.test8;

/**
 * Created by fzq on 2017/12/20.
 */

public class DaggerPresenter {

    TestActivity8 activity;
    User user;

    public DaggerPresenter(TestActivity8 activity, User user){
        this.activity = activity;
        this.user = user;
    }

    public void showUserName() {
        activity.showUserName(user.name);
    }
}
