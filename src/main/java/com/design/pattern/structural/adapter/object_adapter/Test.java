package com.design.pattern.structural.adapter.object_adapter;

/**
 * 对象适配（常用）
 */
public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.read(new SDCardImpl());
        computer.write(new SDCardImpl(),"hello world ===> SD");


        computer.read(new SDAdapterTF(new TFCardImpl()));
        computer.write(new SDAdapterTF(new TFCardImpl()),"hello world ===>TF");


    }

}
