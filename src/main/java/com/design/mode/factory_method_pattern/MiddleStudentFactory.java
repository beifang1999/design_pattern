package com.design.mode.factory_method_pattern;

public class MiddleStudentFactory implements Factory {

    public Student createStudent(String name, Long age) {
        return new MiddleStudent(name, age);
    }

}
