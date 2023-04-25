package com.design.pattern.structural.adapter.class_adapter;

public class SDCardImpl implements SDCard {
    @Override
    public void readSD() {
        System.out.println("读取SD卡");
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("写入SD卡：" + msg);
    }
}
