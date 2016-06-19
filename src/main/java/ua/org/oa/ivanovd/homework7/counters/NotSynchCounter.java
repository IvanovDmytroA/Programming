package ua.org.oa.ivanovd.homework7.counters;

/**
 * Created by Администратор on 20.06.2016.
 */
public class NotSynchCounter implements Runnable{

    private Counter counter;

    public NotSynchCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
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

    public static void notSyncCount () {
        System.out.println("Not synchronized counter");
        Counter counter = new Counter();
        Runnable runnable = new NotSynchCounter(counter);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);
        thread3.start();
        thread4.start();
        System.out.println();
    }
}
