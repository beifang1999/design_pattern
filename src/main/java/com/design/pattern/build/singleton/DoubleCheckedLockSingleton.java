package com.design.pattern.build.singleton;

import java.io.Serializable;

/**
 * 双重检查锁（懒汉）,但序列化以及反射会造成 单例失败
 */
public class DoubleCheckedLockSingleton implements Serializable {


    private DoubleCheckedLockSingleton() {
        //防止反射破坏单例
        if(instance !=null){
            throw new RuntimeException();
        }
    }

    private static volatile DoubleCheckedLockSingleton instance;

    public static DoubleCheckedLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockSingleton();
                }
            }
        }
        return instance;
    }

    //防止序列化破坏单例
    private Object readResolve() {
        return DoubleCheckedLockSingleton.instance;
    }


}
