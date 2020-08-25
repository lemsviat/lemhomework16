package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.state;

public class Student {
    private Activity state;

    public void setState(Activity state) {
        this.state = state;
    }
    public void doSomething(){
        state.doSomething(this);
    }
}
