package com.fzq.testdaager2.test3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.fzq.testdaager2.R;

/**
 * Created by fzq on 2018/1/8.
 *  ---- 解决依赖类的构造函数带有参数的问题
 *  学习链接：
 *  “一盘沙拉”带你入门Dagger2（二）之带参数怎么办
 *  http://blog.csdn.net/Android_Study_OK/article/details/52398946
 */

public class TestActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        Log.i("TestActivity3.java", "onCreate() --- start ");
        Salad3 salad3 = new Salad3();

    }
}
