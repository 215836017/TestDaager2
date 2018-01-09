package com.fzq.testdaager2.test4;

import android.util.Log;

/**
 * Created by fzq on 2018/1/8.
 */

public class Apple {

    private String color;

    public Apple(){
        Log.i("Apple1.java", "我是一个普通的Apple");
    }

    public Apple(String color){
        this.color = color;

        Log.i("Apple1.java", "我是一个有颜色的苹果");
    }
}
