package com.fzq.testdaager2.test6;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by fzq on 2018/1/8.
 *
 * @Singleton 是java提供给我们的注解，其实在Dagger2里面有一个注解@Scope也是用来
 * 实现单例的（这个说法不严谨）
 * 1. java提供的@Singleton 只能实现全局单例，即只要在这个app里，无论在哪里，这个类都是单例
 * 2. 而Dagger2提供的@Scope，能够让一个类在某个区域内实现单例，脱离这个区域他又不是单例了。
 * 3. 比如：Knife小刀，我们让Knife在注入到苹果、桔子时是单例（即苹果、桔子用的是同一把刀），
 * Knife在注入Meat（肉）这个类里时，是另一把刀（很显然，切肉和切水果不能使用同一把刀），这时如果
 * 使用@Singleton 是不行的，他使得Knife在全局都是单例（即切水果和切肉都是用同一把刀），
 * 但是使用@Scope可以实现这个需求。
 * 4. Scope就是区域、范围的意思，他会让Dagger2知道，在那些范围内使用的是一个依赖的同一个对象，
 * 而不仅仅是在全局指定单例模式
 *
 *
 * 5. 所以， 这里我们要让苹果、梨使用同一把刀，让香蕉使用另外一把刀
 */
public class TestActivity6 extends AppCompatActivity {
}
