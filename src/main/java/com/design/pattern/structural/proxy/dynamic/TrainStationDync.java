package com.design.pattern.structural.proxy.dynamic;


public class TrainStationDync implements SellTickets {

    private int price;

    public TrainStationDync() {
    }

    public TrainStationDync(int price) {
        this.price = price;
    }

    @Override
    public int sell() {

        System.out.println("火车站卖票" + price + "元！");
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
