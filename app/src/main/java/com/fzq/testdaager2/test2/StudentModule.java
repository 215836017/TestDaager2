package com.fzq.testdaager2.test2;


import com.fzq.testdaager2.test1.AreaBean;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fzq on 2018/1/8.
 *
 * 说明，这里用到了两个类：AreaBean 和 InfoBean， 区别是前者用了@Injcet， 后者没有。
 */

@Module
public class StudentModule {

    // 返回值（被依赖的类类型）
    // 方法名（provideXxx必须以provide开头，后面随意）

    @Provides
    public AreaBean provideArea(){
        return new AreaBean();
    }

    @Provides
    public InfoBean provideInfo(){
        return new InfoBean();
    }
}
