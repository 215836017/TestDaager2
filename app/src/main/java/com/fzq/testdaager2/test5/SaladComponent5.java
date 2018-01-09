package com.fzq.testdaager2.test5;

import com.fzq.testdaager2.bean.Banana;
import com.fzq.testdaager2.bean.Pear;
import com.fzq.testdaager2.bean.SaladSauce;
import com.fzq.testdaager2.test3.Knife;
import com.fzq.testdaager2.test3.Orange;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by fzq on 2018/1/8.
 *
 * 在接口上添加@Singleton 注释 即可
 */

@Singleton   //注意是在接口上添加，注意位置
@Component(modules = {Salad5.class})
public interface SaladComponent5 {

    Banana provideBanana();
    Pear providePear();
    SaladSauce provideSalad();

    //Salad的依赖Orange，而Orange又依赖了Knife，所以要把两者都引入
    //Orange provideOragne(Knife knife);//★注意：这里千万不能带参数，否则报错

    Orange provideOrange();   //不是在这里添加@Singleton
    Knife provideKnife();

    void injcet(Salad5 salad5);
}
