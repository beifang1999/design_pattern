package com.design.pattern.build.factory.method;

public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {

        return coffeeFactory.creatCoffee();
    }

}
