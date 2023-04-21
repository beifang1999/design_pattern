package com.design.pattern.prototype_pattern;

import java.io.*;

/**
 * 原型模式 浅拷贝很简单，实现 Cloneable 接口，然后重写 clone方法就行了
 * 深度拷贝就复杂一点了 ：两种方案，(也有其他方案）
 * 1.对 类的引用类型属性 实现浅拷贝 如此例。但对于 不可变的引用类就不用了，如String ，Integer ,数组等。
 * 2.实现Serializable接口，使用流的形式 进行 深度拷贝
 */
public class StartUp {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
//        Student student = new Student("10");
//        ConcretePrototype prototype = new ConcretePrototype("abc", 12898, student);
//        ConcretePrototype clone = prototype.clone();
//        System.out.println(prototype + "\t" + clone);
//        System.out.println(VM.current().addressOf(prototype.getStudent()) + "\t" + VM.current().addressOf(clone.getStudent()));
//
//        Student student1 = clone.getStudent();
//        student1.setId("20");
//        clone.setStudent(student1);
//        System.out.println(VM.current().addressOf(prototype.getStudent()) + "\t" + VM.current().addressOf(clone.getStudent()));
//
//        System.out.println("原型对象：" + prototype);
//        System.out.println("克隆对象：" + clone);
//        if (prototype == clone) {
//            System.out.println("是同一个对象");
//        } else {
//            System.out.println("不是同一个对象");
//        }

        Student student = new Student("10");
        ConcretePrototype prototype = new ConcretePrototype("abc", 12898, student);
        ConcretePrototype clone = prototype.deepClone();

        System.out.println(prototype == clone);
        System.out.println(prototype.getStudent() == clone.getStudent());

    }
}


class Student implements Cloneable, Serializable {

    private String id;

    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return (Student) object;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                '}';
    }
}

class ConcretePrototype implements Cloneable, Serializable {

    private String name;
    private Integer age;

    private Student student;

    public ConcretePrototype() {
    }

    public ConcretePrototype(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public ConcretePrototype(String name, Integer age, Student student) {
        this.name = name;
        this.age = age;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", student=" + student +
                '}';
    }

    /**
     * 深度克隆
     *
     * @return 克隆后对象
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public ConcretePrototype deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流中

        ByteArrayOutputStream bao = new ByteArrayOutputStream();

        ObjectOutputStream oos = new ObjectOutputStream(bao);

        oos.writeObject(this);


        //将对象从流中取出

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());

        ObjectInputStream ois = new ObjectInputStream(bis);

        return (ConcretePrototype) ois.readObject();

    }

    @Override
    public ConcretePrototype clone() throws CloneNotSupportedException {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Not support cloneable");
        }
        ConcretePrototype temp = (ConcretePrototype) object;
        temp.student = temp.getStudent().clone();

        return temp;
    }
}

