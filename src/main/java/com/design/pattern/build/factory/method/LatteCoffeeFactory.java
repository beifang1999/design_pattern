package com.design.pattern.build.factory.method;

public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee creatCoffee() {
        LatteCoffee latteCoffee = new LatteCoffee();
        latteCoffee.addMilk();
        latteCoffee.addSugar();

        return latteCoffee;
    }
}
