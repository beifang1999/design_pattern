package com.design.pattern.build.singleton;


/**
 * 饿汉式 枚举（极力推荐）
 */
public class EnumSingletonObject {


    /**
     * 默认构造器为public ，这里设置为private 防止客户端可以构造，只有通过getInstance方法才可以构建对象
     */
    private EnumSingletonObject() {
    }

    public static EnumSingletonObject getInstance(){
        return SingletonEnum.INSTANCE.getInstance();
    }

    private enum SingletonEnum {

        INSTANCE;

        private EnumSingletonObject instance;

        SingletonEnum() {
            this.instance = new EnumSingletonObject();
        }
        private EnumSingletonObject getInstance() {
            return instance;
        }
    }
}
