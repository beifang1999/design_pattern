package com.design.pattern.factory_method_pattern;

public abstract class Student {
    protected String name;
    protected Long age;

    public Student() {
    }

    public Student(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    public abstract void school();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
