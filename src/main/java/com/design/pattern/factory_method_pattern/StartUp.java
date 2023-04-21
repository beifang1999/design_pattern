package com.design.pattern.factory_method_pattern;

public class StartUp {

    public static void main(String[] args) {
        Factory middleStudentFactory = new MiddleStudentFactory();
        Student middleStudent = middleStudentFactory.createStudent("yjt", 16L);
        middleStudent.school();
        System.out.println(middleStudent);

        System.out.println("+++++++++++++++++");

        Factory pupilFactory = new PupilFactory();
        Student pupil = pupilFactory.createStudent("小明", 10L);
        pupil.school();
        System.out.println(pupil);


    }


}
