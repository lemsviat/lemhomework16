package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.visitor;

public class Master implements Student{
    @Override
    public void writePartOfDiploma(GraphicsPartOfDiploma graphicsPartOfDiploma) {
        System.out.println("Master draws GraphicsPartOfDiploma");
    }

    @Override
    public void writePartOfDiploma(TextPartOfDiploma textPartOfDiploma) {
        System.out.println("Master writes TextPartOfDiploma");
    }
}
