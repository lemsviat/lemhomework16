package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Diploma diploma=new Diploma();
        Student bachelor=new Bachelor();
        Student master=new Master();

        diploma.beWritten(bachelor);
        System.out.println();
        diploma.beWritten(master);

    }
}
