package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.facade;

public class NormalStudent {
    public void writeDiploma(DeadLine deadLine){
        if (deadLine.isDeadLineArrived()){
            System.out.println("Student: It's time for hard working, do it for 24/7");
        }
        else System.out.println("Student: Life is so beautiful to spent it for diploma:)");
    }
}
