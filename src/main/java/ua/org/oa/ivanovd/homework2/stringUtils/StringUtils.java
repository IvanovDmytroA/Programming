package ua.org.oa.ivanovd.homework2.stringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Администратор on 19.05.2016.
 */
public class StringUtils {

    public static StringBuffer upendStrings(String string) {
        int charPosition = string.length() - 1;
        StringBuffer str = new StringBuffer();
        while (charPosition >= 0) {
            str.append(string.charAt(charPosition));
            charPosition--;
        }
        return str;
    }

    public static boolean checkPalindrome(String string) {
        String[] listWithWords = string.split("[\\s,.!\\-]+");
        StringBuffer strBuffer = new StringBuffer();
        for (String s : listWithWords) {
            strBuffer.append(s);
        }
        StringBuffer upendentString = upendStrings(strBuffer.toString());
        return strBuffer.toString().equalsIgnoreCase(upendentString.toString());
    }

    public static String checkStringLength (String string) {
        String str = null;
        if (string.length() > 10) {
            str = string.substring(0, 6);
        } else {
            StringBuilder strBuilder = new StringBuilder(string);
            for (int i = 0; i < 12 - string.length(); i++){
                strBuilder.append('o');
            }
            str = strBuilder.toString();
        }
        return str;
    }

    public static String swapWords (String string) {
        String [] array = string.split(" ");
        StringBuilder strBuilder = new StringBuilder();
        int i = array.length - 1;
        strBuilder.append(array[i]).append(" ");
        for (int j = 1; j != i; j++) {
            strBuilder.append(array[j]).append(" ");
        }
        strBuilder.append(array[0]);
        return strBuilder.toString();
    }

    public static String swapWordsInSentences (String string) {
        String[] array = string.split("\\.");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
            array[i] = swapWords(array[i]);
            array[i] = array[i].trim();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            if (i == array.length - 1){
                sb.append(array[i]);
                sb.append(".");
            }
            else{
                sb.append(array[i]);
                sb.append(". ");
            }
        }
        return sb.toString();
    }

    public static boolean checkCharacters (String string) {
        Pattern p = Pattern.compile("[abc]+");
        Matcher m = p.matcher(string);
        return m.matches();
    }

    public static boolean isDate (String string) {
        Pattern p = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d");
        Matcher m = p.matcher(string);
        return m.matches();
    }

    public static boolean isEmail (String string) {
        Pattern p = Pattern.compile("^[-\\w.]+@([A-z0-9][-A-z0-9]+\\.)+[A-z]{2,4}$");
        Matcher m = p.matcher(string);
        return m.matches();
    }

    public static ArrayList<String> findPhoneNumbers (String string){
        Pattern p = Pattern.compile("^\\+\\d\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
        Matcher m;
        String[] array = string.split("\\s+");
        ArrayList<String> numbers = new ArrayList<>();
        for (String s : array) {
            m = p.matcher(s);
            if (m.matches()){
                numbers.add(s);
            }
        }
        return numbers;
    }
}
