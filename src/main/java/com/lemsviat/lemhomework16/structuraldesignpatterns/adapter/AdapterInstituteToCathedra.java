package main.java.com.lemsviat.lemhomework16.structuraldesignpatterns.adapter;

public class AdapterInstituteToCathedra extends InstituteSchedule implements CathedraSchedule {

    @Override
    public void cathedraAdd() {
        addSubject();
    }

    @Override
    public void cathedraUpdate() {
        updateSubject();
    }

    @Override
    public void cathedraRead() {
        readSubject();
    }

    @Override
    public void cathedraRemove() {
        removeSubject();
    }
}
