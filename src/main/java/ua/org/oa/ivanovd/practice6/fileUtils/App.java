package ua.org.oa.ivanovd.practice6.fileUtils;

/**
 * Created by Администратор on 21.06.2016.
 */
public class App {
    public static void main(String[] args) {
        Thread thread1 = new PathFinder();
        thread1.start();

        Thread thread2 = new FileCopier();
        thread2.start();
    }
}
