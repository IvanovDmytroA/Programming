package ua.org.oa.ivanovd.homework7.interruptedClasses;

/**
 * Created by Администратор on 19.06.2016.
 */
public class App {
    public static void main(String[] args) {
        MyThread.interruptMyThread();
        MyThreadRunnable.interruptMyThreadRunnable();
    }
}
