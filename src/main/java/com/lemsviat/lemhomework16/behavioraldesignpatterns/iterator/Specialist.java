package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.iterator;

public class Specialist implements Collection {
    private String name;
    private String[] competences;

    public Specialist(String name, String[] competences) {
        this.name = name;
        this.competences = competences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCompetences() {
        return competences;
    }

    public void setCompetences(String[] competences) {
        this.competences = competences;
    }

    @Override
    public Iterator getIterator() {
        return new CompetencesIterator();
    }

    private class CompetencesIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < competences.length;
        }

        @Override
        public Object next() {
            return competences[index++];
        }
    }
}
