package main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.prototype;

public class PrototypeApp {
    public static void main(String[] args) {
        Student student=new Student(1,"Ivan");
        System.out.println("student = " + student);

        StudentFactory studentFactory=new StudentFactory(student);
        Student studentClone=studentFactory.cloneStudent();
        System.out.println("studentClone = " + studentClone);

        System.out.println("Это один  и тот же объект - "+(student==studentClone));
        System.out.println("Эти объекты равны - "+(student.equals(studentClone)));

    }
}
