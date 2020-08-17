package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.flyweight;

import main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.decorator.Student;

import java.util.ArrayList;
import java.util.List;

public class FlyweightDemo {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        List<Student> students = new ArrayList<>();
        students.add(flyWeightFactory.getStudentByLevel("student"));
        students.add(flyWeightFactory.getStudentByLevel("bachelor"));
        students.add(flyWeightFactory.getStudentByLevel("master"));

        students.add(flyWeightFactory.getStudentByLevel("student"));
        students.add(flyWeightFactory.getStudentByLevel("bachelor"));
        students.add(flyWeightFactory.getStudentByLevel("master"));

        students.add(flyWeightFactory.getStudentByLevel("student"));
        students.add(flyWeightFactory.getStudentByLevel("bachelor"));
        students.add(flyWeightFactory.getStudentByLevel("master"));

        for (Student student : students) {
            System.out.println(student.study());
        }

    }
}
