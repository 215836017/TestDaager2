package com.fzq.testdaager2.test7;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fzq on 2018/1/8.
 */
@Module
public class TomatoModule {

    @Provides
    public Tomato provideTomato(){
        return new Tomato();
    }
}
