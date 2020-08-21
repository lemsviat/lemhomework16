package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        Competence isEngineer = getEngineerCompetence();
        Competence isTechnologist=getTechnologistCompetence();

        System.out.println("Is this specialist an Engineer? "+isEngineer.checkCompetence("SolidWorks, AutoCAD"));
        System.out.println("Is this specialist a Technologist? "+isTechnologist.checkCompetence("Chemistry, Technology"));
    }

    public static Competence getEngineerCompetence() {
        Competence solidworks = new SimpleChecking("SolidWorks");
        Competence inventor = new SimpleChecking("Inventor");
        return new ChoiceVariantChecking(solidworks, inventor);
    }

    public static Competence getTechnologistCompetence() {
        Competence chemistry = new SimpleChecking("Chemistry");
        Competence technology = new SimpleChecking("Technology");
        return new CumulativeChecking(chemistry, technology);
    }
}
