package main.java.com.lemsviat.lemhomework16.creationaldesignpatterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (correct)." + "\n" +
                "If you see different values, then 2 singletons were created (fail)." + "\n\n" +
                "RESULT:" + "\n");
        Thread threadOne = new Thread(new ThreadCandidateFirst());
        Thread threadTwo = new Thread(new ThreadCandidateSecond());
        threadOne.start();
        threadTwo.start();
    }

    static class ThreadCandidateFirst implements Runnable {
        @Override
        public void run() {
            Rector candidate1 = Rector.getInstance("Ivan Ivanovich");
            System.out.println(candidate1.name);
        }
    }

    static class ThreadCandidateSecond implements Runnable {
        @Override
        public void run() {
            Rector candidate2 = Rector.getInstance("Petr Petrovich");
            System.out.println(candidate2.name);
        }
    }
}
