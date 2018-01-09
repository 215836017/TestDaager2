package com.fzq.testdaager2.test6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by fzq on 2018/1/8.
 *
 * 自定义一个作用域
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface KnifeScope {
}
