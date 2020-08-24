package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.memento;

import java.time.LocalDateTime;

public class MementoDemo {
    public static void main(String[] args) throws InterruptedException {
        GroupOfStudents groupOfStudents=new GroupOfStudents(23, LocalDateTime.now());
        System.out.println(groupOfStudents);

        BaseOfStudents baseOfStudents=new BaseOfStudents();
        baseOfStudents.setCurrentSave(groupOfStudents.save());

        Thread.sleep(3000);
        groupOfStudents.setQuantityOfStudents(25);
        groupOfStudents.setTime(LocalDateTime.now());
        System.out.println(groupOfStudents);

        groupOfStudents.load(baseOfStudents.getCurrentSave());
        System.out.println(groupOfStudents);



    }
}
