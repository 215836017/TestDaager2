package com.fzq.testdaager2.test2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.fzq.testdaager2.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by fzq on 2018/1/8.
 *
 * @Provides 1. @Provides可以认为是对@Inject的补充。对于@Inject不能满足的情况，可以使用@Provides注解方法来满足依赖性，
 * 该方法的定义返回类型满足了其依赖关系。不管是接口还是第三方库的类，甚至是相关的配置对象，
 * 都可以通过@Provides方法来提供了，以弥补@Inject的盲区。
 * 2. 甚至，@Provides方法本身可能也拥有自身的依赖关系。
 * 3. 按照惯例，对于@Provides方法的命名以provide为前缀，例如， provideXx.
 * 4. 值得注意的是，@Provides方法本身是不能独立存在的，它必须依附于一个Module。所谓的Module是
 * 具有@Module注解的类
 *
 * @Module: 之前已经提到了，@Inject可以提供依赖关系，但是其不是万能的。如果我们所需要的提供的构造函数
 * 没有使用@Inject注解，比如，第三方库里的类，我们并没有权限修改源码。这时，Module类可以在不修改源码构造函数
 * 的情况下，提供依赖关系。即使是可以用@Inject注解的，依然可以通过Module提供依赖关系。
 * 这里，我们需要明确的一个概念是@Module注解的类，是向Dagger提供依赖关系。
 */

public class TestActivity2 extends AppCompatActivity {

    private final String tag = "TestActivity2.java";

    @BindView(R.id.TestAct1_text)
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.TestAct1_button)
    public void btnClick() {
        StudentBean2 beann = new StudentBean2();

        textView.setText(beann.getInfo());
        Log.i(tag, beann.getInfo());
    }
}
