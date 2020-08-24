package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.observer;

public interface Observable {
    void addStudent(Student student);
    void removeStudent(Student student);
    void notifyStudents();

}
