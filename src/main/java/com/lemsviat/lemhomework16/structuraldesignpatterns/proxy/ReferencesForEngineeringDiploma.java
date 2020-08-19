package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.proxy;

public class ReferencesForEngineeringDiploma implements References{
    private String url;

    public ReferencesForEngineeringDiploma(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading references from "+url+"...");
    }

    @Override
    public void insertIntoDiploma() {
        System.out.println("Inserting references into diploma...");
    }
}
