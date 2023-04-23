package com.design.pattern.build.factory.simple;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        switch (type) {
            case "american":
                return new AmericanCoffee();

            case "latte":
                return new LatteCoffee();

            default:
                System.out.println("our store not have " + type + " coffee");
                return null;
        }
    }
}
