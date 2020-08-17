package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.decorator;

public class MasterOfEngineering extends StudentDecorator{
    public MasterOfEngineering(Student student) {
        super(student);
    }
    public String studyMastersSubjects() {
        return " Studies masters's engineering subjects.";
    }

    @Override
    public String study() {
        return super.study() + studyMastersSubjects();
    }
}
