package ua.org.oa.ivanovd.practice6.schedule;

/**
 * Created by Администратор on 20.06.2016.
 */
public class App {

    public static void main(String[] args) {
        int[] time = {1000, 3000, 4000, 1000};
        String[] message = {"Java", "C#", "Python", "Scala"};
        Thread thread = new MySchedule(message, time);
        thread.start();
    }
}
