package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.adapter;

public class InstituteSchedule {
    public void addSubject(){
        System.out.println("Добавлена дисциплина...");
    }
    public void updateSubject(){
        System.out.println("Изменена дисциплина...");
    }
    public void readSubject(){
        System.out.println("Получено расписание дисциплины...");
    }
    public void removeSubject(){
        System.out.println("Удалена дисциплина...");
    }
}
