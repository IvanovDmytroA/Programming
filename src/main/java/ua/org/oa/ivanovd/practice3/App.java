package ua.org.oa.ivanovd.practice3;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 18.04.2016.
 */
public class App {
    public static void main(String[] args) {
        User user1 = new User(1, "Vanya", "Vanya007", "123456");
        User user2 = new User(2, "Kolya", "Kolya228", "654321");
        User user3 = new User(3, "Vasya", "Sadovnik", "qwerty");
        User user4 = new User(4, "Slava", "Wargod", "abcdef");

        GenericStorage<Integer, User> userList = new GenericStorage<>();
        userList.add(1, user1);
        userList.add(2, user2);
        userList.add(3, user3);
        userList.add(4, user4);

        System.out.println(userList.getValue(3));
        System.out.println();

        userList.remove(user4);

        Book book1 = new Book(1, "Chuck Palahniuk", "Fight Club");
        Book book2 = new Book(2, "Chuck Palahniuk", "Survivor");
        Book book3 = new Book(3, "Chuck Palahniuk", "Choke");
        Book book4 = new Book(4, "Chuck Palahniuk", "Snuff");
        Book book5 = new Book(5, "Chuck Palahniuk", "Damned");

        GenericStorage<Integer, Book> bookList = new GenericStorage<>();
        bookList.add(1, book1);
        bookList.add(2, book2);
        bookList.add(3, book3);
        bookList.add(4, book4);
        bookList.add(5, book5);


        System.out.println(bookList.getValue(2));
        System.out.println();

        bookList.remove(book5);

        user1.addBookToList(book1);
        System.out.println(book1.usersReport(user1));
        System.out.println();

        user1.addBookToList(book2);
        user1.addBookToList(book3);
        user1.returnBook(book1);
        user1.showUsersBooks();
        System.out.println();

        Report report = new Report(1, book2, user1);
        book2.bookReport(report);


    }

}

