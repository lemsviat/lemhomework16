package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.chainofresponsibility;

public class CathedraReport extends ReportSender{

    public CathedraReport(int reportLevel) {
        super(reportLevel);
    }

    @Override
    public void write(String report) {
        System.out.println("Cathedra is sending report. "+report);
    }
}
