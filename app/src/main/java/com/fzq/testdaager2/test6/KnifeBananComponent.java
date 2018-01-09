package com.fzq.testdaager2.test6;

import dagger.Component;

/**
 * Created by fzq on 2018/1/8.
 */

@KnifeScope
@Component(modules = {KnifeForBananaModule.class})
public interface KnifeBananComponent {

    void inject(Banana1 banana1);
}
