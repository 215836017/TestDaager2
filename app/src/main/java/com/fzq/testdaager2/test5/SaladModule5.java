package com.fzq.testdaager2.test5;

import com.fzq.testdaager2.bean.Banana;
import com.fzq.testdaager2.bean.Pear;
import com.fzq.testdaager2.bean.SaladSauce;
import com.fzq.testdaager2.test3.Knife;
import com.fzq.testdaager2.test3.Orange;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fzq on 2018/1/8.
 */

@Module
public class SaladModule5 {

    @Provides
    public Banana provideBanana() {
        return new Banana();
    }

    @Provides
    public Pear providePear() {
        return new Pear();
    }

    @Provides
    public SaladSauce provideSaladSauce() {
        return new SaladSauce();
    }

    @Singleton // 单例，注意是在方法上添加，不是在类上面
    @Provides
    public Orange provideOrange(Knife knife) {
        return new Orange(knife, 3);
    }

    //   因为Salad所依赖的Orange又依赖了Knife，所以这里也要把Knife管理起来
    //    同理，如果这个Knife还依赖了别的类，也要在这里引入
    @Provides
    public Knife provideKnife() {
        return new Knife();
    }
}
