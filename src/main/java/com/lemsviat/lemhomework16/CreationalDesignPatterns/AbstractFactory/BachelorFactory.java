package main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.AbstractFactory;

public class BachelorFactory implements SpecialistFactory {
    @Override
    public Specialist createSpecialist(SpecialistType specialistType) {
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
}

