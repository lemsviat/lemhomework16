package main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.factorymethod;

public class University {
    public static void main(String[] args) {
        MasterFactory masterfactory = new MasterFactory();
        Master master = masterfactory.createMaster(MasterType.TECH);
        master.works();
    }
}
