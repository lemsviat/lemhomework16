package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.mediator;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MediatorDemo {
    public static void main(String[] args) {
        ChatOfCathedra chatOfCathedra = new ChatOfCathedra();

        User headOfCathedra=new HeadOfCathedra(chatOfCathedra,"Сидор Сидорович");
        User member1= new MemberOfCathedra(chatOfCathedra,"Иван");
        User member2= new MemberOfCathedra(chatOfCathedra,"Николай");
        User member3= new MemberOfCathedra(chatOfCathedra,"Клара");

        //headOfCathedra.setEnable(false);
        //member1.setEnable(false);
        //member2.setEnable(false);
        //member3.setEnable(false);


        chatOfCathedra.setHeadOfCathedra(headOfCathedra);
        chatOfCathedra.addMember(member1);
        chatOfCathedra.addMember(member2);
        chatOfCathedra.addMember(member3);

        headOfCathedra.sendMessage("Заседание кафедри назначено на "+
                LocalDateTime.of(2020,8,27,11, 0));
        System.out.println();
        member1.sendMessage("Хорошо, буду!");
        System.out.println();
        member2.sendMessage("И я буду!");
        System.out.println();
        member3.sendMessage("Я тоже буду!");


    }
}
