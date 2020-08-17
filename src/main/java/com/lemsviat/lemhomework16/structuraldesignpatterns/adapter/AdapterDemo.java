package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        CathedraSchedule cathedraSchedule =new AdapterInstituteToCathedra();

        cathedraSchedule.cathedraAdd();
        cathedraSchedule.cathedraUpdate();
        cathedraSchedule.cathedraRead();
        cathedraSchedule.cathedraRemove();
    }
}
