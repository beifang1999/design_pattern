package com.design.pattern.factory_method_pattern;

public class PupilFactory implements Factory{
    public Student createStudent(String name, Long age) {
        return new Pupil(name,age);
    }
}
