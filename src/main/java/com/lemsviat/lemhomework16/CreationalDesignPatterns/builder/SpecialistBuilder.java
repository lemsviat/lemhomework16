package main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.builder;

import main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.abstractfactory.Specialist;
import main.java.com.lemsviat.lemhomework16.CreationalDesignPatterns.abstractfactory.SpecialistType;

public interface SpecialistBuilder {
    void setSpecialistType(SpecialistType specialistType);
    Specialist getSpecialist(SpecialistType specialistType);
    SpecialistType getSpecialistType();
}
