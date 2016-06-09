package ua.org.oa.ivanovd.practice3;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 18.04.2016.
 */
public class App {
    public static void main(String[] args) {
        User user1 = new User("Vanya", "Vanya007", "123456");
        User user2 = new User("Kolya", "Kolya228", "654321");
        User user3 = new User("Vasya", "Sadovnik", "qwerty");
        User user4 = new User("Slava", "Wargod", "abcdef");

        GenericStorage<Integer, User> userList = new GenericStorage<>();
        userList.add(1, user1);
        userList.add(2, user2);
        userList.add(3, user3);
        userList.add(4, user4);

        userList.remove(user2);

        System.out.println(userList.getValue(3));


    }

    }

