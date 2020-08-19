package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.composite;

import main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.abstractfactory.Bachelor;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Bachelor> bachelors = new ArrayList<>();
    public void addTeamMember(Bachelor bachelor){
        bachelors.add(bachelor);
    }
    public void CreateComplexDiploma(){
        System.out.println("Team are writing complex diploma...\n");
        for (Bachelor bachelor : bachelors) {
            bachelor.works();
        }
    }
}
