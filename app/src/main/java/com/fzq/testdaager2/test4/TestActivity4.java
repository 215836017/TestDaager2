package com.fzq.testdaager2.test4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.fzq.testdaager2.R;

import javax.inject.Inject;

/**
 * Created by fzq on 2018/1/8.
 * 当一个类有两个构造函数时，使用Dagger2时，如何获取指定构造函数new出来的对象,
 * 这时就要使用@Qualifier限定符来解决这个问题
 */

public class TestActivity4 extends AppCompatActivity {


    @Inject
    Salad4 salad4;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

//        Salad4 salad4 = new Salad4();
    }
}
