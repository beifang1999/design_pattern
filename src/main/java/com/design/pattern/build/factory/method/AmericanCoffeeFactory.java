package com.design.pattern.build.factory.method;

public class AmericanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee creatCoffee() {
        AmericanCoffee americanCoffee = new AmericanCoffee();
        americanCoffee.addMilk();
        americanCoffee.addSugar();

        return americanCoffee;
    }
}
