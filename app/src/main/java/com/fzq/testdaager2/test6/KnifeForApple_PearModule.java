package com.fzq.testdaager2.test6;

import com.fzq.testdaager2.test3.Knife;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fzq on 2018/1/8.
 *
 * 在Module里使用 @KnifeScope，指定目前这个Module的使用范围
 */
@Module
public class KnifeForApple_PearModule {

    @KnifeScope
    @Provides
    public Knife provideKnife(){
        return new Knife();
    }

}
