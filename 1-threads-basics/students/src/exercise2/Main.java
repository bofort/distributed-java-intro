package exercise2;

public class Main {

    public static void main(String[] args) {
        Thread[] th = new Thread[4];
        th[0] = new MyThread("Thread_0");
        th[1] = new MyThread("Thread_1");
        th[2] = new MyThread("Thread_2");
        th[3] = new MyThread("Thread_3");

        for(int i=0;i<4;i++){
            th[i].start();
        }
    }
}
