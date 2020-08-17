package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.decorator;

public class BachelorOfEngineering extends StudentDecorator {
    public BachelorOfEngineering(Student student) {
        super(student);
    }

    public String studyBachelorsSubjects() {
        return " Studies bachelor's engineering subjects.";
    }

    @Override
    public String study() {
        return super.study() + studyBachelorsSubjects();
    }
}
