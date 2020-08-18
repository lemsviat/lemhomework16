package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.bridge;

public class FutureEngineer implements DiplomaWriter{
    @Override
    public void writeOfDiploma() {
        System.out.println("Будущий инженер пишет диплом по инженерии...");
    }
}
