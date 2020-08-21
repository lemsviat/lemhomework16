package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.command;

public class WritingPhase implements Phase {
    Diploma diploma;

    public WritingPhase(Diploma diploma) {
        this.diploma = diploma;
    }

    @Override
    public void executePhase() {
        diploma.create();
    }
}
