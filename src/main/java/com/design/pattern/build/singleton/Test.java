package com.design.pattern.build.singleton;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {

        //TODO:枚举(极力推荐)
        EnumSingletonObject instance = EnumSingletonObject.getInstance();
        EnumSingletonObject instance1 = EnumSingletonObject.getInstance();
        System.out.println(instance1 == instance);

        //TODO:双重检查锁
        DoubleCheckedLockSingleton instance2 = DoubleCheckedLockSingleton.getInstance();
        DoubleCheckedLockSingleton instance3 = DoubleCheckedLockSingleton.getInstance();
        System.out.println(instance2 == instance3);

        //TODO:静态内部类（极力推荐）
        StaticInnerClassSingleton instance4 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton instance5 = StaticInnerClassSingleton.getInstance();

        System.out.println(instance4 == instance5);


        Class clazz = StaticInnerClassSingleton.class;
        //获取Singleton类的私有无参构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);

        //创建Singleton类的对象s1
        StaticInnerClassSingleton s1 = (StaticInnerClassSingleton) constructor.newInstance();
        //创建Singleton类的对象s2
        StaticInnerClassSingleton s2 = (StaticInnerClassSingleton) constructor.newInstance();

        //判断通过反射创建的两个Singleton对象是否是同一个对象
        System.out.println(s1 == s2);



    }
}
