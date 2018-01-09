package com.fzq.testdaager2.test2;

import com.fzq.testdaager2.test1.AreaBean;

import dagger.Component;

/**
 * Created by fzq on 2018/1/8.
 */

@Component(modules = {StudentModule.class})
public interface StudentComponent {

    //注意：下面这两个方法，返回值必须是从上面指定的依赖库StudentModule.class中取得的对象
    //注意：而方法名不一致也行，但是方便阅读，建议一致，因为它主要是根据返回值类型来找依赖的

    //★注意：下面这两个方法也可以不写，但是如果要写，就按照这个格式来
    //但是当Component要被别的Component依赖时，
    //这里就必须写这个方法，不写代表不向别的Component暴露此依赖

    AreaBean provideArea();
    InfoBean provideInfo();


    //注意：下面的这个方法，表示要将以上的两个依赖注入到某个类中
    //这里我们把上面的两个依赖注入到StudentBean2中

    void inject(StudentBean2 student);
}
