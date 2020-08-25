package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.state;

public class Relax implements Activity {
    private int hoursOfRelaxing = 0;

    @Override
    public void doSomething(Student context) {
        if (hoursOfRelaxing < 2) {
            System.out.println("Student is relaxing " + hoursOfRelaxing + " hours...");
            hoursOfRelaxing++;
        } else {
            System.out.println("It's time for working");
            context.setState(new Work());
        }
    }
}
