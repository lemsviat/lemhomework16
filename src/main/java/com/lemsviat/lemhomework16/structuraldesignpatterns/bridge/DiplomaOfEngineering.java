package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.bridge;

public class DiplomaOfEngineering extends Diploma{
    protected DiplomaOfEngineering(DiplomaWriter diplomaWriter) {
        super(diplomaWriter);
    }

    @Override
    public void writeDiploma() {
        System.out.println("Пора писать диплом по инженерии!");
        diplomaWriter.writeOfDiploma();
    }
}
