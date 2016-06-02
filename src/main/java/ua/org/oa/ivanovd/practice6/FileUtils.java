package ua.org.oa.ivanovd.practice6;

/**
 * Created by Администратор on 26.05.2016.
 */
public class FileUtils extends Thread{


   public FileUtils(String name) {
       super(name);
   }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                sleep(500);
                System.out.println(getName() + " " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
