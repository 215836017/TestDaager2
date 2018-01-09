package com.fzq.testdaager2.test3;

import android.util.Log;

/**
 * Created by fzq on 2018/1/8.
 */

public class Orange {

    private Knife knife;

    public Orange(Knife knife, int level){
        this.knife=knife;

        knife.cut();

        Log.i("Orange.java", "我是一个桔子");

    }
}
