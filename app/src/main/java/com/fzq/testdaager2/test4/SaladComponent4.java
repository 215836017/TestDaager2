package com.fzq.testdaager2.test4;

import com.fzq.testdaager2.bean.Banana;
import com.fzq.testdaager2.bean.Pear;
import com.fzq.testdaager2.bean.SaladSauce;

import dagger.Component;

/**
 * Created by fzq on 2018/1/8.
 */

@Component(modules = {Salad4.class})
public interface SaladComponent4 {

    Banana provideBanana();

    Pear providePear();

    SaladSauce provideSalad();



    //关键靠这个限定符来区分调用哪个构造函数
    @AppleType("normal")
    Apple provideNormalApple();//这个方法名并不重要，只要是provide开头就行，但是建议和module里一致

    @AppleType("color")
    Apple provideColorApple();

    String provideString();

    void inject(Salad4 salad4);
}
