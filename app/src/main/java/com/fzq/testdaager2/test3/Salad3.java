package com.fzq.testdaager2.test3;

import android.util.Log;

import com.fzq.testdaager2.bean.Banana;
import com.fzq.testdaager2.bean.Pear;
import com.fzq.testdaager2.bean.SaladSauce;

import javax.inject.Inject;

/**
 * Created by fzq on 2018/1/8.
 */

public class Salad3 {

    @Inject
    Banana banana;
    @Inject
    Pear pear;
    @Inject
    SaladSauce saladSauce;

    //注入桔子1
    @Inject
    Orange orange1;
    //注入桔子
    @Inject
    Orange orange2;
    //注入小刀（如果你想使用小刀对象，这里要注入小刀，否则不用注入）
    @Inject
    Knife knife;


    public Salad3() {
        // DaggerSaladComponent编译时才会产生这个类，
        // 所以编译前这里报错不要着急(或者现在你先build一下)
//    SaladComponent3 saladComponent = DaggerSaladComponent3.create();
//      saladComponent.inject(this);//将saladComponent所连接的SaladModule中管理的依赖注入本类中


        Log.i("Salad3.java", "orange1 -- " + orange1.toString());
        Log.i("Salad3.java", "orange2 -- " + orange2.toString());

        Log.i("Salad3.java", "我在搅拌制作水果沙拉 -- 11111");

        makeSalad(banana, pear);
//        makeSalad(banana, pear, saladSauce, orange, knife);
    }

    private void makeSalad(Banana banana, Pear pear) {

        Log.i("Salad3", "我在搅拌制作水果沙拉 -- 22222");
    }

    private void makeSalad(Banana banana, Pear pear, SaladSauce saladSauce, Orange orange, Knife knife) {

        Log.i("Salad3", "我在搅拌制作水果沙拉 -- 33333");
    }
}
