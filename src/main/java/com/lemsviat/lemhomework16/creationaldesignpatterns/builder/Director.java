package main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.builder;

import main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.abstractfactory.SpecialistType;

public class Director {
    public void makeMasterOfEngineering(MasterBuilder builder){
        builder.setSpecialistType(SpecialistType.ENG);
    }
    public void makeMasterOfTechnology(MasterBuilder builder){
        builder.setSpecialistType(SpecialistType.TECH);
    }
    public void makeMasterOfEconomics(MasterBuilder builder){
        builder.setSpecialistType(SpecialistType.ECON);
    }

    public void makeBachelorOfEngineering(BachelorBuilder builder){
        builder.setSpecialistType(SpecialistType.ENG);
    }
    public void makeBachelorOfTechnology(BachelorBuilder builder){
        builder.setSpecialistType(SpecialistType.TECH);
    }
    public void makeBachelorOfEconomics(BachelorBuilder builder){
        builder.setSpecialistType(SpecialistType.ECON);
    }
}
