package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.interpreter;

public class ChoiceVariantChecking implements Competence {
    private Competence competence1;
    private Competence competence2;

    public ChoiceVariantChecking(Competence competence1, Competence competence2) {
        this.competence1 = competence1;
        this.competence2 = competence2;
    }

    @Override
    public boolean checkCompetence(String context) {
        return competence1.checkCompetence(context)||competence2.checkCompetence(context);
    }
}
