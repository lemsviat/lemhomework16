package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Student master=new MasterOfEngineering(new BachelorOfEngineering(new StudentOfEngineering()));
        Student bachelor=new BachelorOfEngineering(new StudentOfEngineering());
        Student student=new StudentOfEngineering();
        System.out.println(master.study());
        System.out.println(bachelor.study());
        System.out.println(student.study());
    }

}
