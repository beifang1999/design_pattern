package com.design.pattern.build.factory.expend;


import com.design.pattern.build.factory.simple.Coffee;


/**
 * 配置文件 加 简单工厂 的方式 可以避免开闭原则
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Coffee am = CoffeeFactory.createCoffee("american");
        am.getName();

    }
}
