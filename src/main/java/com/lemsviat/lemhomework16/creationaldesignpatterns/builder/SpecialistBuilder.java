package main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.builder;

import main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.abstractfactory.Specialist;
import main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.abstractfactory.SpecialistType;

public interface SpecialistBuilder {
    void setSpecialistType(SpecialistType specialistType);
    Specialist getSpecialist(SpecialistType specialistType);
    SpecialistType getSpecialistType();
}
