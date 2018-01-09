package com.fzq.testdaager2.test5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.fzq.testdaager2.R;

/**
 * Created by fzq on 2018/1/8.
 * @Singleton可以方便地实现单例（全局单例）
 *
 * 可以在test3 的包中，Salad3.java中引用两个Orange类做对比
 */

public class TestActivity5 extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        Salad5 salad5 = new Salad5();
    }
}
