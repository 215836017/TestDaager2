package com.fzq.testdaager2.test1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.fzq.testdaager2.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by fzq on 2018/1/8.
 *
 * @Inject 在Dagger 2中，使用javax.inject.Inject注解来标识需要依赖注入的构造函数和字段，以满足Dagger构造应用
 * 程序类的实例并满足其依赖性。
 * @Inject有两项职责：
 * 1.注解构造函数：通过标记构造函数，告诉Dagger 2可以创建该类的实例(Dagger2通过Inject标记可以在需要这个
 * 类实例的时候来找到这个构造函数并把相关实例new出来)从而提供依赖关系。
 * 2. 注解依赖变量：通过标记依赖变量，Dagger2提供依赖关系，注入变量
 */

public class TestActivity1 extends AppCompatActivity {

    private final String tag = "TestActivity1.java";

    @BindView(R.id.TestAct1_text)
    TextView textView;

    @Inject
    StudenBean studenBean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.TestAct1_button)
    public void btnClick() {
//        textView.setText(studenBean.toString());
//        Log.i(tag, studenBean.toString());

        StudentBean1 studentBean1 = new StudentBean1(); // 或者也可以对studentBean1的构造方法使用@Inject
        textView.setText(studentBean1.toString());
        Log.i(tag, studentBean1.toString());
    }
}
