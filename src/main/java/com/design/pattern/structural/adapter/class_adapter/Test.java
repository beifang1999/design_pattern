package com.design.pattern.structural.adapter.class_adapter;

/**
 * 类对象适配(不常用)
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.read(new SDCardImpl());
        computer.write(new SDCardImpl(), "hello world SD");

        //代理

        computer.read(new SDAdapterTF());
        computer.write(new SDAdapterTF(), "hello world TF");


    }


}
