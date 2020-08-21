package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.chainofresponsibility;

public class InstituteReport extends ReportSender{
    public InstituteReport(int reportLevel) {
        super(reportLevel);
    }

    @Override
    public void write(String report) {
        System.out.println("Institute is sending report. "+report);
    }
}
