package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.chainofresponsibility;

public abstract class ReportSender {
    private final int reportLevel;
    private ReportSender nextReportSender;

    public ReportSender(int reportLevel) { //constructor
        this.reportLevel = reportLevel;
    }

    public void setNextReportSender(ReportSender nextReportSender) {
        this.nextReportSender = nextReportSender;
    }

    public void sendReport(String report, int currentLevel) {
        if (currentLevel >= reportLevel) {
            write(report);
        }
        if (nextReportSender != null) {
            nextReportSender.sendReport(report, currentLevel);
        }
    }

    public abstract void write(String report);
}
