package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.decorator;

public class StudentDecorator implements Student {
Student student;

    public StudentDecorator(Student student) {
        this.student = student;
    }

    @Override
    public String study() {
        return student.study();
    }
}
