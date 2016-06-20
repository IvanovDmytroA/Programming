package ua.org.oa.ivanovd.practice6.schedule;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Администратор on 20.06.2016.
 */
public class MySchedule extends Thread{
    Map<String, Integer> map = new LinkedHashMap<>();

    public MySchedule(String[] message, int[] time) {
        for (int i = 0; i < message.length; i++){
            map.put(message[i], time[i]);
        }
    }

    @Override
    public void run() {
        try {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                Thread.sleep(entry.getValue());
                System.out.println(entry.getKey());
            }
        } catch (InterruptedException e) {
            System.out.println("EXCEPTION!!!");
        }
    }
}
