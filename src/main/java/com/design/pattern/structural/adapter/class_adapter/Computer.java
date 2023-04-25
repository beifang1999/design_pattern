package com.design.pattern.structural.adapter.class_adapter;

public class Computer {


    public void read(SDCard sdCard) {
        sdCard.readSD();
    }

    public void write(SDCard sdCard, String msg) {
        sdCard.writeSD(msg);
    }

}
