package com.fzq.testdaager2.test6;

import android.util.Log;

import com.fzq.testdaager2.test3.Knife;

import javax.inject.Inject;

/**
 * Created by fzq on 2018/1/8.
 */

public class Banana1 {

    @Inject
    Knife knife;

    public Banana1() {

        Log.i("Banana1.java", "我是一根香蕉");

//        KnifeBananComponent knifeForBananaComponent = DaggerKnifeBananComponent.builder().knifeForBananaModule(new KnifeForBananaModule()).build();
//        knifeForBananaComponent.inject(this);

        // 上面的两句也等于下面的一句
        MyApplication.getKnifeComponentBanan().inject(this);

        Log.i("Banana1", "kinfe在香蕉中的内存地址：" + knife.toString());
    }
}
