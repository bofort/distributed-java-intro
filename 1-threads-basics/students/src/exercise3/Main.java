package exercise3;

public class Main {

    public static void main(String[] args) {

        Thread[] th = new Thread[4];
        th[0] = new Thread(new MyRunnable());
        th[1] = new Thread(new MyRunnable());
        th[2] = new Thread(new MyRunnable());
        th[3] = new Thread(new MyRunnable());

        for(int i = 0;i<4;i++){
            th[i].start();
        }

    }
}
