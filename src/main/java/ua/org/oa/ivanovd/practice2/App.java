package ua.org.oa.ivanovd.practice2;

import java.util.ArrayList;

import static ua.org.oa.ivanovd.practice2.Parser.parseNameRating;

/**
 * Created by Администратор on 09.06.2016.
 */
public class App {
    public static void main(String[] args) {
        System.out.printf(Parser.toString(parseNameRating(Parser.readFile(Parser.PATH))));
    }
}
