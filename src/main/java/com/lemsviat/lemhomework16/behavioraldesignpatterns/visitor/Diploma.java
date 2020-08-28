package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.visitor;

public class Diploma implements PartOfDiploma{
    PartOfDiploma[]partsOfDiploma;

    public Diploma() {
        this.partsOfDiploma = new PartOfDiploma[]{
            new TextPartOfDiploma(), new GraphicsPartOfDiploma()
        };
    }

    @Override
    public void beWritten(Student student) {
        for (PartOfDiploma partOfDiploma : partsOfDiploma) {
            partOfDiploma.beWritten(student);
        }
    }
}
