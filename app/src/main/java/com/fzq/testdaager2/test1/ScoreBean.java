package com.fzq.testdaager2.test1;

/**
 * Created by fzq on 2018/1/8.
 */
public class ScoreBean {

    private int classCount;
    private float chinese;
    private float math;
    private float english;

    public ScoreBean(){
        this.classCount = 3;
        this.chinese = 66.6f;
        this.math = 77.7f;
        this.english = 88.8f;
    }

    @Override
    public String toString() {
        return "ScoreBean{" +
                "classCount=" + classCount +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }
}
