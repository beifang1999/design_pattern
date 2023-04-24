package com.design.pattern.structural.proxy.jdk_static_proxy;

public class TrainStation implements SellTickets {

    private int price;


    @Override
    public int sell() {
        this.price = 5;
        System.out.println("火车站卖票5元");
        return price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TrainStation{" +
                "price=" + price +
                '}';
    }
}
