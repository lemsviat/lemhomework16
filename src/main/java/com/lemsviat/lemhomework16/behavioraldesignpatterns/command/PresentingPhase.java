package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.command;

public class PresentingPhase implements Phase {
    Diploma diploma;

    public PresentingPhase(Diploma diploma) {
        this.diploma = diploma;
    }

    @Override
    public void executePhase() {
        diploma.show();
    }
}
