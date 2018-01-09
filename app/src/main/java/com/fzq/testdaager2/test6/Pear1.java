package com.fzq.testdaager2.test6;

import android.util.Log;

import com.fzq.testdaager2.test3.Knife;

import javax.inject.Inject;

/**
 * Created by fzq on 2018/1/8.
 */

public class Pear1 {

    @Inject
    Knife knife;

    public Pear1(){
        Log.i("Pear1.java", "我是一个梨");
        MyApplication.getKnifeComponent().inject(this);

        Log.i("Pear1.java", "梨里的knife内存地址："+knife.toString());
    }
}
