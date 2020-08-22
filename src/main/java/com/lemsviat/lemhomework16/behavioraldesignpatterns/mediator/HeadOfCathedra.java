package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.mediator;

public class HeadOfCathedra extends User{

    public HeadOfCathedra(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Заведующий кафедрой "+getName()+" получает сообщение '"+message+"'");
    }
}
