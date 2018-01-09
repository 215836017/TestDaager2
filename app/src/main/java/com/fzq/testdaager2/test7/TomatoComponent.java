package com.fzq.testdaager2.test7;

import dagger.Component;

/**
 * Created by fzq on 2018/1/8.
 */
@Component(modules = {TomatoModule.class})
public interface TomatoComponent {

    // ★前面说过这里的这个方法是可以不写的，
    // 但是，如果你想让别的Component依赖这个Component，
    // 就必须写，不写这个方法，就意味着没有向外界，暴露这个依赖

    Tomato provideTomato();

    //    void inject(Object o);//这里的西红柿并没有想注入到那个类中，可以不写inject方法
}

/*
  接下来以包test3为例，  如果想要在Salad3中使用Tomato的话，只需要在SaladComponent3里
  引入TomatoComponent即可：
  第1步：
    @Component(modules = {SaladModule.class},dependencies = {TomatoComponent.class})//引入TomatoComponent
    public interface SaladComponent {
    .....
    //这里代码不用动

第2步：
    然后在Salad3里面注入tomato，别忘了“tomatoComponent(tomatoComponent)”：
    public class Salad {
    @Inject
    Tomato tomato;
       ......
    public Salad() {
       // 这里必须先得到TomatoComponent
        TomatoComponent tomatoComponent = DaggerTomatoComponent.builder().tomatoModule(new TomatoModule()).build();
        // 在这里通过传入“tomatoComponent(tomatoComponent)”构建SaladComponent，
        SaladComponent3 saladComponent = DaggerSaladComponent3.builder().saladModule(new SaladModule()).tomatoComponent(tomatoComponent).build();
        saladComponent.inject(this);

        ......


    }
}
```


 */
