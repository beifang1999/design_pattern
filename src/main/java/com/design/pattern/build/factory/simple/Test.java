package com.design.pattern.build.factory.simple;


/**
 * 简单工厂模式
 */
public class Test {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();

        Coffee american = coffeeStore.orderCoffee("american");
        american.getName();

        Coffee latte = coffeeStore.orderCoffee("latte");
        latte.getName();

        Coffee na_tie = coffeeStore.orderCoffee("na tie");

        System.out.println(na_tie);
    }
}
