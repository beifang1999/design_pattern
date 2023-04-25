package com.design.pattern.structural.proxy.cglib_static_proxy;

public class Test {
    public static void main(String[] args) {
        ProxyFactory<TrainStationDync> trainStationDyncProxyFactory = new ProxyFactory<>(new TrainStationDync(20));
        TrainStationDync proxyObject = trainStationDyncProxyFactory.getProxyObject();
        System.out.println(proxyObject.sell(5));
        proxyObject.getTicketType("train");
        int price = proxyObject.getPrice();
        System.out.println(price);

        Airport airportProxy = new ProxyFactory<>(new Airport(1000)).getProxyObject();

        System.out.println(airportProxy.sell(200));
        airportProxy.getTicketType("plain");
        airportProxy.setPrice(13000);
        System.out.println(airportProxy.getPrice());


    }
}
