package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.command;

public class PretenderToSpecialist {
    Phase write;
    Phase present;

    public PretenderToSpecialist(Phase write, Phase present) {
        this.write = write;
        this.present = present;
    }

    public void writeDiploma(){
        write.executePhase();
    }

    public void presentDiploma(){
        present.executePhase();
    }
}
