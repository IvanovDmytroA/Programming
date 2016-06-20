package ua.org.oa.ivanovd.practice6.fileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Администратор on 21.06.2016.
 */
public class PathFinder extends Thread{

    public static final String LOG = "src\\main\\java\\ua\\org\\oa\\ivanovd\\practice6\\log.txt";
    public static final String PATH = "src\\main\\java\\ua\\org\\oa\\ivanovd\\practice6";

    public void searchFiles(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(LOG), true))) {
                    if (file.getName().contains(".txt")) {
                        bw.write(file.getAbsolutePath() + '\n');
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (file.isDirectory()) {
                new Thread(() -> searchFiles(directoryPath.concat("\\").concat(file.getName()))).start();
            }
        }
    }

    @Override
    public void run() {
        searchFiles(PATH);
    }
}
