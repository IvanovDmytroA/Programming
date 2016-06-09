package ua.org.oa.ivanovd.practice2;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Администратор on 09.06.2016.
 */
public class Parser {

    public static final String PATH = "D:\\Java\\baby2008.html";

    public static char[] readFile(String path){
        File file = new File(path);
        char[] buffer = null;
        try{
            buffer = new char[(int)file.length()];
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), "windows-1251"));
            br.read(buffer);
            br.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return buffer;
    }

    public static ArrayList<Rating> parseNameRating(char[] buffer){
        String str = new String(buffer);
        ArrayList<Rating> res = new ArrayList<>();
        Pattern p = Pattern.compile("<td>(\\d+)</td><td>([a-zA-Z]+)</td><td>([a-zA-Z]+)</td>");
        Matcher m = p.matcher(str);
        while (m.find()) {
            Rating rating = new Rating(Integer.parseInt(m.group(1)), m.group(2), m.group(3));
            res.add(rating);
        }
        return res;
    }

    public static String toString(ArrayList list) {
        StringBuilder sb = new StringBuilder();
        for (Object o : list) {
            sb.append(o);
            sb.append('\n');
        }
        return sb.toString();
    }
}
