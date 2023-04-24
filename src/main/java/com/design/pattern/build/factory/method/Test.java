package com.design.pattern.build.factory.method;

public class Test {
    public static void main(String[] args) {


        CoffeeStore coffeeStore = new CoffeeStore(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();
        coffee.getName();


        System.out.println("===============");

        coffeeStore = new CoffeeStore(new LatteCoffeeFactory());
        coffee = coffeeStore.orderCoffee();
        coffee.getName();
    }
}
