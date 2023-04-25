package com.design.pattern.structural.decorator;

public abstract class StapleFood {
    protected String name;
    protected String desc;
    protected int price;

    public StapleFood(String name, String desc, int price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public abstract int getCost();

    public abstract void getDesc();



}
