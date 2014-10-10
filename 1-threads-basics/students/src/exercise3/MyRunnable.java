package exercise3;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Name =" +Thread.currentThread().getName());
    }

}
