package com.design.pattern.structural.adapter.object_adapter;


public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public void readSD() {
        System.out.println("读取适配");
        tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("写入适配");
        tfCard.writeTF(msg);
    }
}
