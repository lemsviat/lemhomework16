package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.facade;

public class DeadLine {
    private boolean deadLineArrived;

    public boolean isDeadLineArrived() {
        return deadLineArrived;
    }

    public void StartHardWorking() {
        System.out.println("Author: Deadline is coming...");
        deadLineArrived = true;
    }

    public void Procrastination() {
        System.out.println("Author: Deadline may be never come...");
        deadLineArrived = false;
    }
}
