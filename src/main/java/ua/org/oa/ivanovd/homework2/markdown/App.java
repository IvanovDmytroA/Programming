package ua.org.oa.ivanovd.homework2.markdown;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Администратор on 23.05.2016.
 */
public class App {
    public static void main(String[] args) {
        String string;
        string = Markdown.wrapHeader(Markdown.INPUT);
        string = Markdown.wrapString(string);
        string = Markdown.makeEmphasi(string);
        string = Markdown.makeStrong(string);
        string = Markdown.makeLink(string);

        try{
            FileWriter writer = new FileWriter("D:\\Java\\test.html", false);
            writer.write(string);
            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        System.out.printf(string);
    }
}
