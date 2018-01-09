package com.fzq.testdaager2.test2;

import com.fzq.testdaager2.test1.AreaBean;

import javax.inject.Inject;

/**
 * Created by fzq on 2018/1/8.
 */

public class StudentBean2 {

    @Inject
    AreaBean areaBean;
    @Inject
    InfoBean infoBean;

    private String sbInfo;

    public StudentBean2(){
        // DaggerStudentComponent编译时才会产生这个类，
        // 所以编译前这里报错不要着急(或者现在你先build一下)
//        StudentComponent component = DaggerStudentComponent.create();
//        component.inject(this);

        this.sbInfo = "StudentBean2.java " + areaBean.toString() + infoBean.toString();
    }

    public String getInfo(){
        return this.sbInfo;
    }
}
