package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.templatemethod;

public class TemplateDemo {
    public static void main(String[] args) {
        Student student1=new StudentScientist();
        Student student2=new StudentPractical();
        student1.templateMethod();
        student2.templateMethod();
    }
}
