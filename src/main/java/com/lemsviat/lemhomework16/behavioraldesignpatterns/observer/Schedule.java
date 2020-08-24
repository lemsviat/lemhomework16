package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Schedule implements Observable {
    List<String> subjects = new ArrayList<>();
    List<Student> students = new ArrayList<>();

    public void addSubject(String newSubject){
        subjects.add(newSubject);
        notifyStudents();
    }

    public void removeSubject(String removingSubject){
        subjects.remove(removingSubject);
        notifyStudents();
    }
    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public void notifyStudents() {
        for (Student student : students) {
            student.handleEvent(subjects);
        }
    }
}
