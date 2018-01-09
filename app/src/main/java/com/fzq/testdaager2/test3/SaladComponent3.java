package com.fzq.testdaager2.test3;

import com.fzq.testdaager2.bean.Banana;
import com.fzq.testdaager2.bean.Pear;
import com.fzq.testdaager2.bean.SaladSauce;

import dagger.Component;

/**
 * Created by fzq on 2018/1/8.
 */

@Component(modules = {SaladModule3.class})
public interface SaladComponent3 {

    Banana provideBanana();
    Pear providePear();
    SaladSauce provideSalad();

    //Salad的依赖Orange，而Orange又依赖了Knife，所以要把两者都引入
    //Orange provideOragne(Knife knife);//★注意：这里千万不能带参数，否则报错

    Orange provideOrange();
    Knife provideKnife();

    void injcet(Salad3 salad3);
}
