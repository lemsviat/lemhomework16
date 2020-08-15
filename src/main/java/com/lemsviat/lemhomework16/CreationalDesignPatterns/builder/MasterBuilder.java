package main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.builder;

import main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.abstractfactory.Specialist;
import main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.abstractfactory.SpecialistType;
import main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.factorymethod.MasterOfEconomics;
import main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.factorymethod.MasterOfEngineering;
import main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.factorymethod.MasterOfTechnology;

public class MasterBuilder implements SpecialistBuilder{
    private SpecialistType specialistType;

    @Override
    public void setSpecialistType(SpecialistType specialistType) {
        this.specialistType = specialistType;
    }
    @Override
    public Specialist getSpecialist(SpecialistType specialistType) {
        Specialist toReturn = null;
        switch (specialistType) {
            case ENG:
                toReturn = new MasterOfEngineering();
                break;
            case TECH:
                toReturn = new MasterOfTechnology();
                break;
            case ECON:
                toReturn = new MasterOfEconomics();
                break;
            default:
                System.out.println("Wrong type of specialty");
        }
        return toReturn;
    }

    @Override
    public SpecialistType getSpecialistType() {
        return specialistType;
    }
}
