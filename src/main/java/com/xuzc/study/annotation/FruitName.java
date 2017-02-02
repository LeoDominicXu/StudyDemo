package com.xuzc.study.annotation;

import java.lang.annotation.*;

/**
 * @Description: 水果名称注解
 * @Author: Dominic
 * @Date: 2017/2/2
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
