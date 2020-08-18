package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.bridge;

public class FutureEconomist implements DiplomaWriter{
    @Override
    public void writeOfDiploma() {
        System.out.println("Будущий экономист пишет диплом по экономике...");
    }
}
