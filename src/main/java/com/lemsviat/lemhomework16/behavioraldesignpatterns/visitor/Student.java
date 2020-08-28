package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.visitor;

public interface Student {
    void writePartOfDiploma(GraphicsPartOfDiploma graphicsPartOfDiploma);
    void writePartOfDiploma(TextPartOfDiploma textPartOfDiploma);
}
