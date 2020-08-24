package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.observer;

import java.util.List;

public class Student implements Observer{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void handleEvent(List<String> subjects) {
        System.out.println("Dear student "+name+", your schedule has next subjects: "+subjects);
    }
}
