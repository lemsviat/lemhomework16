package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.proxy;

public class ProxyReferencesForED implements References {
    private String url;
    private ReferencesForEngineeringDiploma referencesForEngineeringDiploma;

    public ProxyReferencesForED(String url) {
        this.url = url;
    }

    @Override
    public void insertIntoDiploma() {
        if (referencesForEngineeringDiploma == null) {
            referencesForEngineeringDiploma = new ReferencesForEngineeringDiploma(url);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Loading completed...");
        }
        referencesForEngineeringDiploma.insertIntoDiploma();
    }
}
