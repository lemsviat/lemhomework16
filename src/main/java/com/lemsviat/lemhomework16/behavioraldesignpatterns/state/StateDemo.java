package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.state;

public class StateDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setState(new Work());
        for (int i = 0; i <9; i++) {
            student.doSomething();
        }

    }
}
