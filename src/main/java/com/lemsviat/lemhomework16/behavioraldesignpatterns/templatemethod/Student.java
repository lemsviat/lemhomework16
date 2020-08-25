package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.templatemethod;

public abstract class Student {
    public void templateMethod(){
        System.out.println("Student is writing Bachelors qualification work...");
        differentMethod();
        System.out.println("Student takes Master diploma...");
    }
    public abstract void differentMethod();

}
