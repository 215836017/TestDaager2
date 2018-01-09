package com.fzq.testdaager2.test8;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


import com.fzq.testdaager2.R;

import javax.inject.Inject;


/**
 * Created by fzq on 2017/12/20.
 * demo 链接：http://blog.csdn.net/u012943767/article/details/51897247
 */

public class TestActivity8 extends AppCompatActivity {

    private static final String TAG = "TestActivity8";

    TextView text;

    @Inject
    DaggerPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);

        text = findViewById(R.id.DaggerAct_textView);
        inject();
        presenter.showUserName();

    }

    private void inject() {

    }

    public void showUserName(String name) {
        text.setText(name);
    }
}
