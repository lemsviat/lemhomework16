package main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.abstractfactory;

import main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.factorymethod.MasterOfEconomics;
import main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.factorymethod.MasterOfEngineering;
import main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.factorymethod.MasterOfTechnology;

public class MasterFactory2 implements SpecialistFactory {
    @Override
    public Specialist createSpecialist(SpecialistType specialistType) {
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
}
