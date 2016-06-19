package ua.org.oa.ivanovd.homework5;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Администратор on 13.06.2016.
 */
public class Translator {

    public static String DIRECTORY = "src\\main\\resources";

    public static Map<String, String> readDictionary(String dictionaryName) {
        File file = new File(Translator.DIRECTORY.concat("\\").concat(dictionaryName));
        Map<String, String> dictionary = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "windows-1251"))) {
            String str;
            while ((str = br.readLine()) != null) {
                String[] strings = str.split("-");
                dictionary.put(strings[0], strings[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dictionary;
    }

    public static String translate(String fileName, Map<String, String> dictionary) {
        File file = new File(Translator.DIRECTORY.concat("\\").concat(fileName));
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "windows-1251"))) {
            String string;
            while ((string = br.readLine()) != null) {
                String[] str = string.split("[\\s\\.]+");
                for (String s : str) {
                    if (dictionary.containsKey(s)) {
                        sb.append(dictionary.get(s)).append(' ');
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString().trim().concat(".");
    }

    public static void execution() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("File to translate: ");
        String fileName = sc.nextLine();
        File file = new File(Translator.DIRECTORY.concat("\\").concat(fileName));
        if (!file.exists()) {
            throw new Exception("No file");
        }

        if (fileName.contains("ru")) {
            System.out.print("Available translation directions: ru-en\n");
        } else if (fileName.contains("en")) {
            System.out.print("Available translation directions: en-ru\n");
        }

        System.out.print("Choose direction: ");
        String translationDirection = sc.nextLine();
        String dictionaryName = translationDirection.concat(".txt");
        file = new File(Translator.DIRECTORY.concat("\\").concat(dictionaryName));
        if (!file.exists()) {
            throw new Exception("No dictionary");
        }

        System.out.println("Translation: " +
                Translator.translate(fileName, Translator.readDictionary(dictionaryName)));

        System.out.print("\nContinue Yes / No: ");
        String isContinue = sc.nextLine();
        if (isContinue.equals("Y")) {
            System.out.println();
            Translator.execution();
        }
        sc.close();
    }
}
