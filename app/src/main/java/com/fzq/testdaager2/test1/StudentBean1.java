package com.fzq.testdaager2.test1;

import javax.inject.Inject;

/**
 * Created by fzq on 2018/1/8.
 */

public class StudentBean1 {

    private int id;
    private String name;

    @Inject
    AreaBean areaBean;
    @Inject
    ScoreBean scoreBean;


    public StudentBean1(){
        this.id = 30;
        this.name = "XiaoHong";
    }

    @Override
    public String toString() {
        return "StudentBean1{" +
                "area: " + areaBean.toString() +
                "score: " + scoreBean.toString() +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
