package ua.org.oa.ivanovd.practice5.io;

import java.io.File;

/**
 * Created by Администратор on 21.06.2016.
 */
public class App {
    public static void main(String[] args) {
        IOUtils stream = new IOUtils();
        File file = stream.createFile("Random_numbers.txt");
        System.out.println("Отсортированные случайные числа:");
        System.out.println(stream.sort(file));
        System.out.println("");
        stream.copy();
        System.out.println("");
        System.out.print(stream.changeWords(IOUtils.fileWithWords));
    }
}
