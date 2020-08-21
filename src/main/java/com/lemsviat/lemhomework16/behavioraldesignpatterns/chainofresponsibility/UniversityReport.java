package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.chainofresponsibility;

public class UniversityReport extends ReportSender {

    public UniversityReport(int reportLevel) {
        super(reportLevel);
    }

    @Override
    public void write(String report) {
        System.out.println("University is sending report. " + report);
    }
}
