package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.memento;

import java.time.LocalDateTime;

public class Save {
    private final int quantityOfStudents;
    private final LocalDateTime time;

    public Save(int quantityOfStudents, LocalDateTime time) {
        this.quantityOfStudents = quantityOfStudents;
        this.time = time;
    }

    public int getQuantityOfStudents() {
        return quantityOfStudents;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
