package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.memento;

public class BaseOfStudents {
    Save currentSave;

    public Save getCurrentSave() {
        return currentSave;
    }

    public void setCurrentSave(Save currentSave) {
        this.currentSave = currentSave;
    }
}
