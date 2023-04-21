package com.design.pattern.factory_method_pattern;

public class MiddleStudent extends Student {
    public MiddleStudent() {
    }

    public MiddleStudent(String name, Long age) {
        super(name, age);
    }

    public void school() {
        System.out.println("this is middle school !");
    }
}
