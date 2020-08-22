package main.java.com.lemsviat.lemhomework16.behavioraldesignpatterns.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        String[] competences = {"SAPR", "MathCAD", "Design of equipment"};
        Specialist specialist = new Specialist("Ivan Sidorov", competences);

        Iterator iterator = specialist.getIterator();
        System.out.println("Specialist: "+ specialist.getName());
        System.out.print("Competences: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

    }
}
