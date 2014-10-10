package exercise2;

import sun.org.mozilla.javascript.EcmaError;

public class MyThread extends Thread {

    MyThread(String name){
        super(name);
    }

    public void run()
    {
            try{
                Thread.sleep(10);
            }catch (Exception ex)
            {

            }
            System.out.println("Name =" + this.getName());
    }

}
