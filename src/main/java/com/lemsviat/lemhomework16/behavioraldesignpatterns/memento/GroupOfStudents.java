package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.memento;

import java.time.LocalDateTime;

public class GroupOfStudents {
    private int quantityOfStudents;
    private LocalDateTime time = LocalDateTime.now();

    public GroupOfStudents(int quantityOfStudents, LocalDateTime time) {
        this.quantityOfStudents = quantityOfStudents;
    }

    public void setQuantityOfStudents(int quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Save save() {
        return new Save(quantityOfStudents, time);
    }

    public void load(Save save) {
        quantityOfStudents = save.getQuantityOfStudents();
        time=save.getTime();
    }

    @Override
    public String toString() {
        return "GroupOfStudents{" +
                "quantityOfStudents=" + quantityOfStudents +
                ", time=" + time +
                '}';
    }
}
