package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatOfCathedra implements Chat {
    User headOfCathedra;
    List<User> membersOfCathedra = new ArrayList<>();

    public void setHeadOfCathedra(User headOfCathedra) {
        if (headOfCathedra instanceof HeadOfCathedra) {
            this.headOfCathedra = headOfCathedra;
        } else {
            throw new RuntimeException("Вы не можете быть админом");
        }
    }

    public void addMember(User memberOfCathedra) {
        if (headOfCathedra == null) {
            throw new RuntimeException("Не назначен админ чата!");
        }
        if (memberOfCathedra instanceof MemberOfCathedra) {
            membersOfCathedra.add(memberOfCathedra);
        } else {
            throw new RuntimeException("Вы не являетесь членом кафедры");
        }
    }

    @Override
    public void sendMessage(String message, User user) {
        if (user instanceof HeadOfCathedra){
            for (User memberOfCathedra : membersOfCathedra) {
                memberOfCathedra.getMessage(memberOfCathedra.getName()+": "+message);
            }
        }
        if (user instanceof MemberOfCathedra && user.isEnable){
            for (User memberOfCathedra : membersOfCathedra) {
                if (memberOfCathedra!=user && memberOfCathedra.isEnable) {
                    memberOfCathedra.getMessage(user.getName()+": "+message);
                }
            }
            if (headOfCathedra.isEnable){
                headOfCathedra.getMessage(user.getName()+": "+message);
            }
            }
    }
}
