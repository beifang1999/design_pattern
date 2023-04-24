package com.design.pattern.build.factory.simple;

import java.io.Serializable;

public abstract class Coffee implements Serializable {

    public abstract void getName();

    public abstract void addMilk();

    public abstract void addSugar();

}
