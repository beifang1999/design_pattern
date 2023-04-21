package com.design.pattern.build.singleton;


import java.io.Serializable;

/**
 * 静态内部类单例 懒汉（推荐）
 */
public class StaticInnerClassSingleton implements Serializable {

    private static StaticInnerClassSingleton instance;

    private StaticInnerClassSingleton() {
        if (instance != null){
            throw new RuntimeException("已经存在单例对象");
        }
    }

    private static class SingletonClass {
        private final static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        instance = SingletonClass.instance;
        return instance;
    }

    //防止序列化破坏单例
    private Object readResolve() {
        return instance;
    }
}
