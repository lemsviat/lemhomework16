package main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.abstractfactory;

public class University2 {
    public static void main(String[] args) {
        SpecialistFactory masterfactory = new MasterFactory2();
        SpecialistFactory bachelorfactory = new BachelorFactory();
        Specialist masterofeng = masterfactory.createSpecialist(SpecialistType.ENG);
        Specialist masteroftech = masterfactory.createSpecialist(SpecialistType.TECH);
        Specialist masterofecon = masterfactory.createSpecialist(SpecialistType.ECON);

        Specialist bachelorofeng = bachelorfactory.createSpecialist(SpecialistType.ENG);
        Specialist bacheloroftech = bachelorfactory.createSpecialist(SpecialistType.TECH);
        Specialist bachelorofecon = bachelorfactory.createSpecialist(SpecialistType.ECON);

        masterofeng.works();
        masteroftech.works();
        masterofecon.works();

        bachelorofeng.works();
        bacheloroftech.works();
        bachelorofecon.works();
    }
}
