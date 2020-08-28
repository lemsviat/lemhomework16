package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.visitor;

public class Bachelor implements Student{
    @Override
    public void writePartOfDiploma(GraphicsPartOfDiploma graphicsPartOfDiploma) {
        System.out.println("Bachelor draws GraphicsPartOfDiploma");
    }

    @Override
    public void writePartOfDiploma(TextPartOfDiploma textPartOfDiploma) {
        System.out.println("Bachelor writes TextPartOfDiploma");
    }
}
