package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.bridge;

public abstract class Diploma {
    protected DiplomaWriter diplomaWriter;

    protected Diploma(DiplomaWriter diplomaWriter) {
        this.diplomaWriter = diplomaWriter;
    }

    public abstract void writeDiploma();
}
