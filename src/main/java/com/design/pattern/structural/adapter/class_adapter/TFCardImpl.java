package com.design.pattern.structural.adapter.class_adapter;

public class TFCardImpl implements TFCard {
    @Override
    public void readTF() {
        System.out.println("读取TF卡片");
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("写入TF卡：" + msg);
    }
}
