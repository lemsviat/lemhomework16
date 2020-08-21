package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.chainofresponsibility;

public class ChainDemo {
    public static void main(String[] args) {
        ReportSender cathedraReport = new CathedraReport(ReportLevel.CATHEDRA);
        ReportSender instituteReport = new InstituteReport(ReportLevel.INSTITUTE);
        ReportSender universityReport = new UniversityReport(ReportLevel.UNIVERSITY);

        cathedraReport.setNextReportSender(instituteReport);
        instituteReport.setNextReportSender(universityReport);

        cathedraReport.sendReport("Everything is OK", ReportLevel.CATHEDRA);
        System.out.println();
        cathedraReport.sendReport("We have some problems", ReportLevel.INSTITUTE);
        System.out.println();
        cathedraReport.sendReport("We have serious problems",ReportLevel.UNIVERSITY);

    }
}
