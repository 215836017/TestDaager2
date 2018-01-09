package com.fzq.testdaager2.test2;

import javax.inject.Inject;

/**
 * Created by fzq on 2018/1/8.
 */

public class InfoBean {

    private int id;
    private String info;

    public InfoBean(){
        this.id = 110;
        this.info = "InfoBean.info";
    }

    @Override
    public String toString() {
        return "InfoBean{" +
                "id=" + id +
                ", info='" + info + '\'' +
                '}';
    }
}
