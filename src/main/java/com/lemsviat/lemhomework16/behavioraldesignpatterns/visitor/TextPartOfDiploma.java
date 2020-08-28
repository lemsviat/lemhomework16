package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.visitor;

public class TextPartOfDiploma implements PartOfDiploma {
    @Override
    public void beWritten(Student student) {
        student.writePartOfDiploma(this);
    }
}
