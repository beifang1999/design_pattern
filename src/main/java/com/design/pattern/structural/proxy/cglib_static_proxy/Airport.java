package com.design.pattern.structural.proxy.cglib_static_proxy;

public class Airport {
    private int price;

    public Airport() {
    }

    public Airport(int price) {
        this.price = price;
    }


    public int sell(int proxyPrice) {

        System.out.println("机场卖票" + price + "元！");

        this.price = price + proxyPrice;

        return price;
    }

    public void getTicketType(String type) {
        System.out.println("这是飞机票");
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TrainStationDync{" +
                "price=" + price +
                '}';
    }


}
