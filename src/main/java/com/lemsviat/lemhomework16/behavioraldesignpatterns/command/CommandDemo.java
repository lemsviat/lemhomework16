package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.command;

public class CommandDemo {
    public static void main(String[] args) {
        Diploma diploma = new Diploma();
        PretenderToSpecialist pretenderToSpecialist = new PretenderToSpecialist(
                new WritingPhase(diploma),
                new PresentingPhase(diploma));

        pretenderToSpecialist.writeDiploma();
        pretenderToSpecialist.presentDiploma();
    }
}
