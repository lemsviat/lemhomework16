package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Diploma [] diplomas={
                new DiplomaOfEngineering(new FutureEngineer()),
                new DiplomaOfEconomics(new FutureEconomist())
        };
        for (Diploma diploma : diplomas) {
            diploma.writeDiploma();
        }
    }
}
