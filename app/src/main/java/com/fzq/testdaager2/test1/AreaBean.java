package com.fzq.testdaager2.test1;

import javax.inject.Inject;

/**
 * Created by fzq on 2018/1/8.
 */

public class AreaBean {

    private String provice;
    private String city;

    @Inject
    public AreaBean(){
        this.provice = "浙江";
        this.city = "杭州";
    }



    @Override
    public String toString() {
        return "AreaBean{" +
                "provice='" + provice + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
