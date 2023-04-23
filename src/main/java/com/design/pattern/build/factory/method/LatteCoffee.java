package com.design.pattern.build.factory.method;

public class LatteCoffee extends Coffee {
    @Override
    public void getName() {
        System.out.println("this is latte coffee");
    }

    @Override
    public void addMilk() {
        System.out.println("add milk");
    }

    @Override
    public void addSugar() {
        System.out.println("add sugar");
    }
}
