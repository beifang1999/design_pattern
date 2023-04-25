package com.design.pattern.structural.decorator;

public class Rice extends StapleFood {

    public Rice() {
        super("rice", "米饭", 10);
    }

    @Override
    public int getCost() {
        return super.price;
    }

    @Override
    public void getDesc() {
        System.out.println("这是米饭");
    }
}
