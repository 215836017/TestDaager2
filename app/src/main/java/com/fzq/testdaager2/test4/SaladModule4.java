package com.fzq.testdaager2.test4;

import com.fzq.testdaager2.bean.Banana;
import com.fzq.testdaager2.bean.Pear;
import com.fzq.testdaager2.bean.SaladSauce;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fzq on 2018/1/8.
 */

@Module
public class SaladModule4 {

    @Provides
    public Banana provideBanana() {
        return new Banana();
    }

    @Provides
    public Pear providePear() {
        return new Pear();
    }

    @Provides
    public SaladSauce provideSalad() {
        return new SaladSauce();
    }

    @AppleType("normal")
    @Provides
    public Apple provideApple(){
        return new Apple();
    }

    @AppleType("color")
    @Provides
    public Apple provideApple(String color){
        return new Apple(color);
    }

    //因为String是个类， 而Apple依赖String类, 所以这里还有管理String类，
    // 如果是 int， float这些基本类型则不需要。
    @Provides
    public String provideString(){
        return new String();
    }
}
