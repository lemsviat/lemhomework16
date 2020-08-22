package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.mediator;

public class MemberOfCathedra extends User{
    public MemberOfCathedra(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Преподаватель "+getName()+" получает сообщение '"+message+"'");

    }
}
