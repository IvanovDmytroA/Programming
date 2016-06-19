package ua.org.oa.ivanovd.homework7.counters;

import java.io.IOException;

/**
 * Created by Администратор on 20.06.2016.
 */
public class App {
    public static void main(String[] args) throws IOException, InterruptedException{
        SynchCounter.syncCount();
        Thread.sleep(500);
        System.out.println();
        NotSynchCounter.notSyncCount();
    }


}
