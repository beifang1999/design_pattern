package com.design.pattern.structural.proxy.jdk_static_proxy;

public class ProxyPoint implements SellTickets {

    private final TrainStation trainStation = new TrainStation();

    @Override
    public int sell() {
        int sell = trainStation.sell();
        System.out.println("代售点加价2元");
        return sell + 2;
    }
}
