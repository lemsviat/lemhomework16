package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Schedule schedule=new Schedule();
        schedule.addSubject("SAPR");
        schedule.addSubject("Mathematics");

        Student student1=new Student("Ivanov Ivan");
        Student student2=new Student("Alexandr Suvorov");
        Student student3=new Student("Vasiliy Vasiliev");
        schedule.addStudent(student1);
        schedule.addStudent(student2);
        schedule.addStudent(student3);

        schedule.addSubject("Equipment");
        schedule.removeSubject("SAPR");


    }
}
