package com.design.pattern.structural.adapter.class_adapter;

public class SDAdapterTF extends TFCardImpl implements SDCard {


    @Override
    public void readSD() {
        System.out.println("读取适配");
        readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("写入适配");
        writeTF(msg);
    }
}
