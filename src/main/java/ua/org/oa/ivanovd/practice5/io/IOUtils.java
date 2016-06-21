package ua.org.oa.ivanovd.practice5.io;

import java.io.*;
import java.util.*;

/**
 * Created by Администратор on 19.05.2016.
 */
public class IOUtils {

    private static String directory = "src\\main\\java\\ua\\org\\oa\\ivanovd\\practice5";
    static String fileWithWords = "src\\main\\java\\ua\\org\\oa\\ivanovd\\practice5\\File_with_words.txt";
    static String copyFrom = "src\\main\\java\\ua\\org\\oa\\ivanovd\\practice5\\From_this_file.txt";
    static String copyTo = "src\\main\\java\\ua\\org\\oa\\ivanovd\\practice5\\To_this_file.txt";

    public File createFile(String name){
        Random random = new Random();
        File file = new File(IOUtils.directory.concat("\\").concat(name));
        try {
            if (!file.createNewFile()) {
                System.out.println("Sorry, " + name + " already exists in this folder");
                return file;
            } else {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 25; i++){
                bw.write(Integer.toString(random.nextInt(400) - 200));
                bw.append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public List sort(File file) {
        ArrayList<Integer> arrays = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()){
                arrays.add(scanner.nextInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(arrays);
        return arrays;
    }

    public String changeWords(String path) {
        StringBuilder sb = new StringBuilder();
        File file = new File(path);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"))) {
            String str;
            while( (str = br.readLine()) != null){
                sb.append(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] strings = sb.toString().split("\\."); //
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strings.length; i++){
            String[] temporary = strings[i].trim().split("\\s");
            if (temporary[0].contains(",")){
                temporary[0] = temporary[0].replace(",", "");
            }
            String temp = temporary[0];
            temporary[0] = temporary[temporary.length - 1];
            temporary[temporary.length - 1] = temp;
            for (int j = 0; j < temporary.length; j++) {
                if (j == temporary.length - 1){
                    result.append(temporary[j]).append(".\n");
                } else {
                    result.append(temporary[j]).append(' ');
                }
            }
        }
        return result.toString().trim();
    }

    public void copy() {
        File copyFrom = new File(IOUtils.copyFrom);
        File copyTo = new File(IOUtils.copyTo);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(copyFrom), "utf-8"));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(copyTo, false)));
             InputStreamReader isr = new InputStreamReader(new FileInputStream(copyFrom), "utf-8");
             FileWriter fw = new FileWriter(copyTo)) {

            int i;
            long timeBefore = System.nanoTime();
            while( (i = br.read()) != -1){
                bw.write(i);
            }
            long timeResultBuffered = System.nanoTime() - timeBefore;
            System.out.printf(Locale.GERMAN, "Buffered stream ", timeResultBuffered);

            timeBefore = System.nanoTime();
            while( (i = isr.read()) != -1){
                fw.write(i);
            }
            long timeResultUnbuffered = System.nanoTime() - timeBefore;
            System.out.printf(Locale.US, "Stream ", timeResultUnbuffered);

            System.out.printf(Locale.US, "Difference ", (timeResultUnbuffered - timeResultBuffered));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
