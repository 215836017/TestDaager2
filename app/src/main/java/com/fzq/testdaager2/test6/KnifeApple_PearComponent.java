package com.fzq.testdaager2.test6;

import dagger.Component;

/**
 * Created by fzq on 2018/1/8.
 * 在Component里使用@KnifeScope，
 * 与之前的KnifeModule相呼应，
 * 指明目前这个Component的使用范围
 */
@KnifeScope
@Component(modules = {KnifeForApple_PearModule.class})
public interface KnifeApple_PearComponent {

    //    注意：这里我们只inject了苹果和梨，说明我们要把KnifeModule
    //    所建立的实例，注入到苹果、梨里（而不注入到香蕉里）

    void inject(Apple1 apple);

    void inject(Pear1 pear);
}
