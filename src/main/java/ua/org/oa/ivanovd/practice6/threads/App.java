package ua.org.oa.ivanovd.practice6.threads;

/**
 * Created by Администратор on 26.05.2016.
 */
public class App {
    public static void main(String[] args) {

        FileUtils myFileUtil = new FileUtils("My first util");
        myFileUtil.run();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("My second util " + i);
                }
            }
        }.start();
    }
}
