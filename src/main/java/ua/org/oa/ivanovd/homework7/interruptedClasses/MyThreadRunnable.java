package ua.org.oa.ivanovd.homework7.interruptedClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Администратор on 19.06.2016.
 */
public class MyThreadRunnable implements Runnable {

    private DateFormat dateFormat = new SimpleDateFormat("HH:MM:SS");
    private Date date;

    public static void interruptMyThreadRunnable() {
        Runnable runnable = new MyThreadRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            date = new Date();
            System.out.println(dateFormat.format(date));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("You interrupted the thread (runnable)");
                Thread.currentThread().interrupt();
            }
        }
    }
}
