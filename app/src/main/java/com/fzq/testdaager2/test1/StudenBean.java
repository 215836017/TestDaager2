package com.fzq.testdaager2.test1;

import javax.inject.Inject;

/**
 * Created by fzq on 2018/1/8.
 */

public class StudenBean {

    private int id;
    private String name;

    @Inject
    public StudenBean(){
        this.id = 20;
        this.name = "Xiaoming";
    }

    @Override
    public String toString() {
        return "StudenBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
