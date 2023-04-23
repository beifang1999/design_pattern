package com.design.pattern.build.factory.method;

public class AmericanCoffee extends Coffee{
    @Override
    public void getName() {
        System.out.println("this is american coffee");
    }

    @Override
    public void addMilk() {
        System.out.println("not milk");
    }

    @Override
    public void addSugar() {
        System.out.println("not sugar");
    }
}
