package ua.org.oa.ivanovd.practice6.fileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 * Created by Администратор on 21.06.2016.
 */
public class FileCopier extends Thread{

    public final static String SEARCH_DIRECTORY = "src\\main\\java\\ua\\org\\oa\\ivanovd\\practice6\\SEARCH_DIRECTORY";
    public final static String COPY_TO_FOLDER = "src\\main\\java\\ua\\org\\oa\\ivanovd\\practice6\\COPY_TO_FOLDER";

    public void copyFiles(String searchDirectory, String copyToFolder) {
        File directoryCopyFrom = new File(searchDirectory);
        try {
            File[] arr = directoryCopyFrom.listFiles();
            for (File file : arr) {
                if (file.isFile()) {
                    String fileName = copyToFolder.concat("\\").concat(file.getName());
                    File newFile = new File(fileName);
                    Files.copy(directoryCopyFrom.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);}
                new Thread(() -> copyFiles(file.getAbsolutePath(), copyToFolder.concat("\\").concat(file.getName()))).start();             }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        copyFiles(SEARCH_DIRECTORY, COPY_TO_FOLDER);
    }
}
