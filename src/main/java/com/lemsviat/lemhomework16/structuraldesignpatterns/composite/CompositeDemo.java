package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.composite;

import main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.abstractfactory.Bachelor;
import main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.abstractfactory.BachelorOfEconomics;
import main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.abstractfactory.BachelorOfEngineering;
import main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.abstractfactory.BachelorOfTechnology;

public class CompositeDemo {
    public static void main(String[] args) {
        Team team=new Team();
        Bachelor bachelorOfEngineering=new BachelorOfEngineering();
        Bachelor bachelorOfTechnology=new BachelorOfTechnology();
        Bachelor bachelorOfEconomics=new BachelorOfEconomics();

        team.addTeamMember(bachelorOfEngineering);
        team.addTeamMember(bachelorOfTechnology);
        team.addTeamMember(bachelorOfEconomics);

        team.CreateComplexDiploma();
    }
}
