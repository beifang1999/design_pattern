package com.design.mode.factory_method_pattern;

public class Pupil extends Student {
    public Pupil() {
    }

    public Pupil(String name, Long age) {
        super(name, age);
    }

    public void school() {
        System.out.println("this is primary school !");
    }
}
