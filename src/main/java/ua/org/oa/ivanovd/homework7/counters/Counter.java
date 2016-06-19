package ua.org.oa.ivanovd.homework7.counters;

import java.io.IOException;

/**
 * Created by Администратор on 20.06.2016.
 */
public class Counter {

    private int count1;
    private int count2;

    public Counter() {
        this.count1 = 0;
        this.count2 = 0;
    }

    public void incrementCounter1() {
        count1++;
    }

    public void incrementCounter2() {
        count2++;
    }

    public int getCounter1() {
        return count1;
    }

    public int getCounter2() {
        return count2;
    }
}
