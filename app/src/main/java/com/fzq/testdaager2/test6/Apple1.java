package com.fzq.testdaager2.test6;

import android.util.Log;

import com.fzq.testdaager2.test3.Knife;

import javax.inject.Inject;

/**
 * Created by fzq on 2018/1/8.
 */

public class Apple1 {

    @Inject
    Knife knife;

    public Apple1() {
        Log.i("Apple1.java", "我是一个苹果");
        MyApplication.getKnifeComponentApple().inject(this);
        Log.e("Apple1.java", "苹果里的knife内存地址：" + knife.toString());
    }
}
