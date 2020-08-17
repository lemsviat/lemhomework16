package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.flyweight;

import main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.decorator.BachelorOfEngineering;
import main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.decorator.MasterOfEngineering;
import main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.decorator.Student;
import main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.decorator.StudentOfEngineering;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    public static final Map<String, Student> students = new HashMap<>();

    public Student getStudentByLevel(String level) {
        Student student = students.get(level);

        if (student == null) {
            switch (level) {
                case "student":
                    System.out.println("Creating student...");
                    student = new StudentOfEngineering();
                    break;
                case "bachelor":
                    System.out.println("Creating bachelor...");
                    student = new BachelorOfEngineering(new StudentOfEngineering());
                    break;
                case "master":
                    System.out.println("Creating master...");
                    student = new MasterOfEngineering(new BachelorOfEngineering(new StudentOfEngineering()));
                    break;
            }
            students.put(level,student);
        }
        return student;
    }
}
