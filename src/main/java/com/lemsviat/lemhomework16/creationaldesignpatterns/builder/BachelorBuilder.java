package main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.builder;

import main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.abstractfactory.*;

public class BachelorBuilder implements SpecialistBuilder{
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
                toReturn = new BachelorOfEngineering();
                break;
            case TECH:
                toReturn = new BachelorOfTechnology();
                break;
            case ECON:
                toReturn = new BachelorOfEconomics();
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
