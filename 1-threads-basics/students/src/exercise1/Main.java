package exercise1;

public class Main {

    public static void main(String[] args) {

            Thread a = Thread.currentThread();

            System.out.println("Name = " + a.getName());
            System.out.println("ID = " + a.getId());

    }
}