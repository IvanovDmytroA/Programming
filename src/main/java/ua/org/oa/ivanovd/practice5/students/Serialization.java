package ua.org.oa.ivanovd.practice5.students;

import java.io.*;

/**
 * Created by Администратор on 21.06.2016.
 */
public class Serialization {

    public static void main(String[] args) {
        Group group = new Group();
        group.addStudent(new Student("Dmytro", "Ivanov"));
        group.addStudent(new Student("Vadym", "Kobzev"));
        group.addStudent(new Student("Vitaliy", "Sidorenko"));

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src\\main\\java\\ua\\org\\oa\\ivanovd\\practice5\\Serialization.txt"))) {
            oos.writeObject(group);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("src\\main\\java\\ua\\org\\oa\\ivanovd\\practice5\\Serialization.txt"))) {
            Group obj = (Group)ois.readObject();
            System.out.print(obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
