package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setState(new WorkAsStrategy());
        student.doSomething();
        student.setState(new RelaxAsStrategy());
        for (int i = 0; i < 3; i++) {
            student.doSomething();
        }


    }
}
