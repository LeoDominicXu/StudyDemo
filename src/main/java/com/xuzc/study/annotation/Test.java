package com.xuzc.study.annotation;

import java.lang.reflect.Field;

/**
 * @Description: The description of the file.
 * @Author: Dominic
 * @Date: 2017/2/2
 */
public class Test {
    public static void main(String[] args) {
        getFruitInfo("com.xuzc.study.annotation.Apple");
    }

    private static void getFruitInfo(String clas) {
        try {
            Class<?> cls = Class.forName(clas);
            Field[] fields = cls.getDeclaredFields();
            for(Field field : fields){
                if(field.isAnnotationPresent(FruitName.class) == true){
                    FruitName name = field.getAnnotation(FruitName.class);
                    System.out.println("Fruit Name:"+name.value());
                }
                if(field.isAnnotationPresent(FruitColor.class)){
                    FruitColor color = field.getAnnotation(FruitColor.class);
                    System.out.println("Fruit Color:"+color.fruitColor());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
