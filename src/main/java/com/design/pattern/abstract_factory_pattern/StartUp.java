package com.design.pattern.abstract_factory_pattern;


/**
 * 此处为抽象工厂模式
 * 个人理解  与工厂模式区别在于 工厂模式是一个工厂一个产品，而抽象工厂模式是一个工厂 多个产品
 * ，这些产品一个产品族，所谓的产品族是某个维度下面的 ，这个例子是品牌维度
 */
public class StartUp {
    public static void main(String[] args) {


        Factory factory = new HaiErFactory();
        TV tv = factory.createTV();
        tv.display();
        WashingMache washingMache = factory.createWashingMache();
        washingMache.display();

    }
}

interface TV {
    public void display();
}

class HaiErTV implements TV {

    public void display() {
        System.out.println("this is 海尔电视机");
    }
}

class ChangHongTV implements TV {
    public void display() {
        System.out.println("this is 长虹电视机");
    }
}

interface WashingMache {
    public void display();
}

class HaiErWashingMache implements WashingMache {
    public void display() {
        System.out.println("this is 海尔洗衣机");
    }
}

class ChangHongWashingMache implements WashingMache {
    public void display() {
        System.out.println("this is 长虹洗衣机");
    }
}

interface Factory {
    public TV createTV();

    public WashingMache createWashingMache();
}

class HaiErFactory implements Factory {
    public TV createTV() {
        return new HaiErTV();
    }

    public WashingMache createWashingMache() {
        return new HaiErWashingMache();
    }
}

class ChangHongFactory implements Factory {

    public TV createTV() {
        return new ChangHongTV();
    }

    public WashingMache createWashingMache() {
        return new ChangHongWashingMache();
    }
}
