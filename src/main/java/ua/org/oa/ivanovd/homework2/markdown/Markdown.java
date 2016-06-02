package ua.org.oa.ivanovd.homework2.markdown;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Администратор on 23.05.2016.
 */
public class Markdown {

    public static final String INPUT = "##Header line\n" +
            "Simple line -with- em\n" +
            "Simple *line* with strong\n" +
            "Line with link [Link to google](https://www.google.com) in center\n" +
            "Line *with* -many- *elements* and link [Link to FB](https://www.facebook.com)";

    public static String wrapHeader(String str) {
        Pattern p1 = Pattern.compile("#(\\w+\\s*)+");
        Pattern p2 = Pattern.compile("#{2}(\\w+\\s*)+");
        Pattern p3 = Pattern.compile("#{3}(\\w+\\s*)+");

        Matcher m1;
        Matcher m2;
        Matcher m3;

        String[] array = str.split("\n");
        StringBuilder sb = new StringBuilder();
        sb.append("<html>\n");
        sb.append("<body>\n");

        for (String s : array) {
            m1 = p1.matcher(s);
            m2 = p2.matcher(s);
            m3 = p3.matcher(s);

            if (m1.matches()) {
                s = s.replace("#", "");
                sb.append("<h1>");
                sb.append(s);
                sb.append("</h1>");
                sb.append("\n");
            } else if (m2.matches()) {
                s = s.replace("##", "");
                sb.append("<h2>");
                sb.append(s);
                sb.append("</h2>");
                sb.append("\n");
            } else if (m3.matches()) {
                s = s.replace("###", "");
                sb.append("<h3>");
                sb.append(s);
                sb.append("</h3>");
                sb.append("\n");
            }
            else{
                sb.append(s);
                sb.append("\n");
            }
        }

        sb.append("</body>\n");
        sb.append("</html>\n");

        return sb.toString();
    }

    public static String wrapString(String str) {
        String[] array = str.split("\n");
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("<.+");
        Matcher m;
        for (String s : array) {
            m = p.matcher(s);

            if (!m.matches()) {
                sb.append("<p>");
                sb.append(s);
                sb.append("</p>");
                sb.append("\n");
            }
            else {
                sb.append(s);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String makeEmphasi(String str){
        String replacement;
        Pattern p = Pattern.compile("-\\w+-");
        Matcher m = p.matcher(str);
        while (m.find()){
            replacement = m.group();
            str = str.replace(replacement, "<em>" + replacement.replace("-", "") + "</em>");
        }
        return str;
    }

    public static String makeStrong(String str){
        String replacement;
        Pattern p = Pattern.compile("\\*\\w+\\*");
        Matcher m = p.matcher(str);
        while (m.find()){
            replacement = m.group();
            str = str.replace(replacement, "<strong>" + replacement.replace("*", "") + "</strong>");
        }
        return str;
    }

    public static String makeLink(String str){
        String temp1;
        String temp2;
        String temp3;
        Pattern p = Pattern.compile("(\\[.+\\])(\\(.+\\))");
        Matcher m = p.matcher(str);
        while (m.find()){
            temp1 = m.group(1);
            temp2 = m.group(2);
            temp3 = temp1 + temp2;

            temp1 = temp1.replace("[", "");
            temp1 = temp1.replace("]", "");

            temp2 = temp2.replace("(", "");
            temp2 = temp2.replace(")", "");
            str = str.replace(temp3, "<a href=\"" + temp2 + "\">" + temp1 + "</a>");
        }
        return str;
    }

}
