package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.facade;

import main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.bridge.DiplomaOfEngineering;

public class FacadeDemo {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.completeDiploma();
    }
}
