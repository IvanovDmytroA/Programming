package ua.org.oa.ivanovd.practice4;

import java.io.*;
import java.util.*;

/**
 * Created by Администратор on 06.06.2016.
 */
public class ReadUtils {

    Map<String, Counter> words;

    public static final String PATH = "D:\\Java\\Romeo.txt";

    public static char[] readFile(String path){
        File file = new File(path);
        char[] buffer = null;
        try{
            buffer = new char[(int)file.length()];
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), "utf-8"));
            br.read(buffer);
            br.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return buffer;
    }

    public Map<String, Counter> uniqueWords(){
        String[] array = new String(ReadUtils.readFile(ReadUtils.PATH)).split("[\\s\\n,.?!\\--:;\\[\\]]+");
        words = new HashMap<>();
        for (String s : array) {
            if (words.containsKey(s)){
                words.get(s).increaseCounter();
            } else {
                words.put(s, new Counter());
            }
        }
        return words;
    }

    public Map<String, Counter> uniqueWords(Enum e){
        Map<String, Counter> words = new ReadUtils().uniqueWords();

        List<Map.Entry<String, Counter>> list = new ArrayList<>(words.entrySet());

        if (e.equals(sortingCriteria.KEY_UP)) {
            Collections.sort(list, new Comparator<Map.Entry<String, Counter>>() {
                @Override
                public int compare(Map.Entry<String, Counter> a, Map.Entry<String, Counter> b) {
                    return a.getKey().compareTo(b.getKey());
                }
            });
        } else if (e.equals(sortingCriteria.KEY_DOWN)) {
            Collections.sort(list, new Comparator<Map.Entry<String, Counter>>() {
                @Override
                public int compare(Map.Entry<String, Counter> a, Map.Entry<String, Counter> b) {
                    return b.getKey().compareTo(a.getKey());
                }
            });
        } else if (e.equals(sortingCriteria.VALUE_UP)) {
            Collections.sort(list, new Comparator<Map.Entry<String, Counter>>() {
                @Override
                public int compare(Map.Entry<String, Counter> a, Map.Entry<String, Counter> b) {
                    return a.getValue().getCounter() - (b.getValue().getCounter());
                }
            });
        } else if(e.equals(sortingCriteria.VALUE_DOWN)) {
            Collections.sort(list, new Comparator<Map.Entry<String, Counter>>() {
                @Override
                public int compare(Map.Entry<String, Counter> a, Map.Entry<String, Counter> b) {
                    return b.getValue().getCounter() - (a.getValue().getCounter());
                }
            });
        }

        Map<String, Counter> map = new LinkedHashMap<>();
        for (Map.Entry<String, Counter> entry : list) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    public void printWords(Map<String, Counter> map){
        for (Map.Entry<String, Counter> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue() + " times");
        }
    }

    private class Counter{
        private int counter = 1;

        public int increaseCounter(){
            counter++;
            return counter;
        }

        public int getCounter() {
            return counter;
        }

        @Override
        public String toString() {
            return String.valueOf(counter);
        }
    }

    public enum sortingCriteria {
        KEY_UP, KEY_DOWN, VALUE_UP, VALUE_DOWN
    }

}
