package com.fzq.testdaager2.test4;

/**
 * Created by fzq on 2018/1/8.
 */

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * 自定义一个限定符
 */
@Qualifier//限定符
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface AppleType {

    String value() default "";  //默认值为空
}
