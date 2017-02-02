package com.xuzc.study.annotation;

import java.lang.annotation.*;

/**
 * @Description: 水果颜色注解.
 * @Author: Dominic
 * @Date: 2017/2/2
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    /**
     * 颜色枚举
     *
     */
    public enum Color{ BULE,RED,GREEN};

    /**
     * 颜色属性
     * @return
     */
    Color fruitColor() default Color.GREEN;
}
