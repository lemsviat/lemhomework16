package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.strategy;

public class WorkAsStrategy implements ActivityForStrategy {
    @Override
    public void doSomething(Student context) {
        for (int i=0; i<5; i++) {
            System.out.println("Student is working "+i+" hours...");
        }
        System.out.println("It's time for relaxing");
    }
}
