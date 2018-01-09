package com.fzq.testdaager2.test6;

import com.fzq.testdaager2.test3.Knife;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fzq on 2018/1/8.
 */

@Module
public class KnifeForBananaModule {

    @KnifeScope
    @Provides
    public Knife provideKnife(){
        return new Knife();
    }
}
