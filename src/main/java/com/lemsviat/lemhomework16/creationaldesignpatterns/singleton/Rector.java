package main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.singleton;

public final class Rector { //Rector is head of some university
    private static volatile Rector instance;
    public String name;

    private Rector(String name) {
        this.name = name;
    }
    public static Rector getInstance(String name) {

        Rector result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Rector.class) {
            if (instance == null) {
                instance = new Rector(name);
            }
            return instance;
        }
    }
}
