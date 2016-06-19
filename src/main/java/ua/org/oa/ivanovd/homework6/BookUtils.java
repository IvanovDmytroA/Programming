package ua.org.oa.ivanovd.homework6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 19.06.2016.
 */
public class BookUtils {

    public static String book = "src\\main\\java\\ua\\org\\oa\\ivanovd\\homework6\\books.txt";

    public List<Book> showInfoFromFile(){
        List<Book> list = new ArrayList<>();
        File file = new File(BookUtils.book);
        String str;
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), "utf-8"))) {
            while ((str = br.readLine()) != null){
                if (!str.isEmpty()) {
                    String[] strings = str.split(";");
                    list.add(new Book(strings[1], strings[0], Integer.parseInt(strings[2])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void addBookToFile(Book book){
        File file = new File(BookUtils.book);
        try (BufferedWriter bw = new BufferedWriter
                (new OutputStreamWriter(new FileOutputStream(file, true),"utf-8"));
             BufferedReader br = new BufferedReader(
                     new InputStreamReader(new FileInputStream(file), "utf-8"))){
            String str = br.readLine();
            if (str != null){
                bw.write("\n" + book.getAuthor());
                bw.write(";");
                bw.write(book.getTitle());
                bw.write(";");
                bw.write(Integer.toString(book.getYear()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString(List<Book> list){
        if (list.size() == 0){
            return "No available books";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                sb.append(list.get(i));
            } else {
                sb.append(list.get(i)).append('\n');
            }
        }
        return sb.toString();
    }
}
