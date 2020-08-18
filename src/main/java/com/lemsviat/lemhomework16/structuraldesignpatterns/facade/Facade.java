package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.facade;

public class Facade {
    NormalStudent normalStudent = new NormalStudent();
    DiplomaOfSpecialist diplomaOfSpecialist = new DiplomaOfSpecialist();
    DeadLine deadLine = new DeadLine();

    public void completeDiploma() {
        diplomaOfSpecialist.waitStudent();

        deadLine.Procrastination();
        normalStudent.writeDiploma(deadLine);

        try {
            Thread.sleep(1000);
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        deadLine.StartHardWorking();
        normalStudent.writeDiploma(deadLine);

        try {
            Thread.sleep(2000);
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Student: Next time I will start it in time, exactly:)" );
    }

}
