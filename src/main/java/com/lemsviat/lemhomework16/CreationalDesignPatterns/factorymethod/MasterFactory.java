package main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.factorymethod;

public class MasterFactory {
    public Master createMaster(MasterType masterType) {
        Master toReturn = null;
        switch (masterType) {
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
