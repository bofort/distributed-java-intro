package exercise1;

import common.Counter;

public class SynchronizedCounter implements Counter {

    private long temp = 0;

    @Override
    public synchronized void increment() {
        this.temp++;
    }

    @Override
    public long getValue() {
        return temp;
    }
}
