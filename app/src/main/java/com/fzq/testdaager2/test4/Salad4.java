package com.fzq.testdaager2.test4;

import android.util.Log;

import com.fzq.testdaager2.bean.Banana;
import com.fzq.testdaager2.bean.Pear;
import com.fzq.testdaager2.bean.SaladSauce;

import javax.inject.Inject;

/**
 * Created by fzq on 2018/1/8.
 */

public class Salad4 {

    @Inject
    Banana banana;
    @Inject
    Pear pear;
    @Inject
    SaladSauce saladSauce;

    @AppleType("normal")
    @Inject
    Apple appleNormal;

    @AppleType("color")
    @Inject
    Apple appleColor;

    @Inject
    public Salad4() {
        // DaggerSaladComponent编译时才会产生这个类，
        // 所以编译前这里报错不要着急(或者现在你先build一下)
//        SaladComponent4 saladComponent = DaggerSaladComponent4.create();
//        saladComponent.inject(this);//将saladComponent所连接的SaladModule中管理的依赖注入本类中

        Log.i("Salad4.java", "我在搅拌制作水果沙拉 -- 111111111");

        makeSalad(pear, banana, saladSauce);

    }

    private void makeSalad(Pear pear, Banana banana, SaladSauce saladSauce) {
        Log.i("Salad4.java", "我在搅拌制作水果沙拉 -- 22222222");
    }
}
