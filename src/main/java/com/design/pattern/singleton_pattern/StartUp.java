package com.design.pattern.singleton_pattern;

public class StartUp {
    public static void main(String[] args) {

    }
}


/**
 * 静态内部类方式（推荐）Initialization Demand Holder (IoDH)
 */
class IoDH {

    private IoDH() {

    }

    private static class HolderClass {
        private final static IoDH instance = new IoDH();
    }

    public static IoDH getInstance() {
        return HolderClass.instance;
    }

}


/**
 * 饿汉模式
 */
class HungryMan {
    private static final HungryMan instance = new HungryMan();

    private HungryMan() {

    }

    public HungryMan getInstance() {
        return instance;
    }
}

/**
 * 懒汉模式（双重检查锁）
 */

class LazyMan {

    private volatile static LazyMan instance = null;

    private LazyMan() {
    }

    public LazyMan getInstance() {
        if (instance == null) {
            synchronized (LazyMan.class) {
                if (instance == null) {
                    instance = new LazyMan();
                }
            }
        }
        return instance;
    }
}