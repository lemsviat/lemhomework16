package main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.prototype;

public class StudentFactory {
    Student student;

    public StudentFactory(Student student) {
        this.student = student;
    }

    Student cloneStudent(){
        return (Student) student.copy();
    }
}
