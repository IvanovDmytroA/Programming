package ua.org.oa.ivanovd.homework7.counters;

/**
 * Created by Администратор on 20.06.2016.
 */
public class SynchCounter implements Runnable {

    private Counter counter;

    public SynchCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Counter 1 = " + counter.getCounter1() + ", Counter 2 = " + counter.getCounter2() + ": ");
            if (counter.getCounter1() > counter.getCounter2()) {
                System.out.println("Counter 1 > Counter 2");
            }
            if (counter.getCounter2() > counter.getCounter1()) {
                System.out.println("Counter 1 < Counter 2");
            }
            if (counter.getCounter1() == counter.getCounter2()) {
                System.out.println("Counter 1 = Counter 2");
            }
            counter.incrementCounter1();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("ERROR!");
            }
            counter.incrementCounter2();
        }
    }

    public static void syncCount () {
        System.out.println("Synchronized counter");
        Counter counter = new Counter();
        Runnable runnable = new SynchCounter(counter);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        System.out.println();
    }
}
