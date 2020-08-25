package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.strategy;

public class Student {
    private ActivityForStrategy state;

    public void setState(ActivityForStrategy state) {
        this.state = state;
    }
    public void doSomething(){
        state.doSomething(this);
    }
}
