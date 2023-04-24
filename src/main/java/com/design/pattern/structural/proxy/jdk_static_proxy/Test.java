package com.design.pattern.structural.proxy.jdk_static_proxy;

/**
 * 静态代理
 */
public class Test {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        int price = proxyPoint.sell();
        System.out.println(price);

    }
}
