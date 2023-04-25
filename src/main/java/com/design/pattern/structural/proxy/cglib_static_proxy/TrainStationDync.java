package com.design.pattern.structural.proxy.cglib_static_proxy;


public class TrainStationDync {

    private int price;

    public TrainStationDync() {
    }

    public TrainStationDync(int price) {
        this.price = price;
    }


    public int sell(int proxyPrice) {

        System.out.println("火车站卖票" + price + "元！");

        this.price = price + proxyPrice;

        return price;
    }

    public void getTicketType(String type) {
        System.out.println("这是火车票");
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
