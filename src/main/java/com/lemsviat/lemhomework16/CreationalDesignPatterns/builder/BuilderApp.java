package main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.builder;

import main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.abstractfactory.Specialist;

public class BuilderApp {
    public static void main(String[] args) {
        Director director = new Director();

        MasterBuilder masterBuilder = new MasterBuilder();
        director.makeMasterOfEngineering(masterBuilder);
        Specialist master = masterBuilder.getSpecialist(masterBuilder.getSpecialistType());
        master.works();

        director.makeMasterOfTechnology(masterBuilder);
        Specialist master1 = masterBuilder.getSpecialist(masterBuilder.getSpecialistType());
        master1.works();

        director.makeMasterOfEconomics(masterBuilder);
        Specialist master2 = masterBuilder.getSpecialist(masterBuilder.getSpecialistType());
        master2.works();

        System.out.println();

        BachelorBuilder bachelorBuilder = new BachelorBuilder();
        director.makeBachelorOfEngineering(bachelorBuilder);
        Specialist bachelor = bachelorBuilder.getSpecialist(bachelorBuilder.getSpecialistType());
        bachelor.works();

        director.makeBachelorOfTechnology(bachelorBuilder);
        Specialist bachelor1 = bachelorBuilder.getSpecialist(bachelorBuilder.getSpecialistType());
        bachelor1.works();

        director.makeBachelorOfEconomics(bachelorBuilder);
        Specialist bachelor2 = bachelorBuilder.getSpecialist(bachelorBuilder.getSpecialistType());
        bachelor2.works();
    }
}
