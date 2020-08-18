package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.bridge;

public class DiplomaOfEconomics extends Diploma {
    protected DiplomaOfEconomics(DiplomaWriter diplomaWriter) {
        super(diplomaWriter);
    }

    @Override
    public void writeDiploma() {
        System.out.println("Пора писать диплом по экономике!");
        diplomaWriter.writeOfDiploma();
    }
}
