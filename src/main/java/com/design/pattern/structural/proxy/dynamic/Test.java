package com.design.pattern.structural.proxy.dynamic;


public class Test {

    public static void main(String[] args) {

        SellTickets proxyObject = ProxyFactory.getProxyObject(new TrainStationDync(10));

        int sell = proxyObject.sell();

        proxyObject.getTicketType("train");

        System.out.println(sell);

    }
}
