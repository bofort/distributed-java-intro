package exercise2;

import common.Counter;
import java.util.concurrent.locks.ReentrantLock;

public class LockingCounter implements Counter {

    private long temp = 0;

    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void increment() {
        lock.lock();
        try {
            this.temp++;
        }catch(Exception ex) {

        }finally {
            lock.unlock();
        }
    }

    @Override
    public long getValue() {
        return temp;
    }
}
