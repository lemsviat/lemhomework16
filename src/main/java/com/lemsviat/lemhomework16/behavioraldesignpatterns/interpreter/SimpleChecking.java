package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.interpreter;

public class SimpleChecking implements Competence {
    private String data;

    public SimpleChecking(String data) {
        this.data = data;
    }

    @Override
    public boolean checkCompetence(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
