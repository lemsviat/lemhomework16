package main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.AbstractFactory;

import main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.FactoryMethod.Master;

public class BachelorOfEngineering implements Bachelor {
    @Override
    public void works() {
        System.out.println("Bachelor of Engineering is making modern equipment...");
    }
}
