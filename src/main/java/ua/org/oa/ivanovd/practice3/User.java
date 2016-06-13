package ua.org.oa.ivanovd.practice3;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 03.06.2016.
 */
public class User {

    private long id;
    private String name;
    private String login;
    private String password;
    List<Book> userBooks = new ArrayList<>();

    public User(long id, String name, String login, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public void addBookToList (Book book) {
        userBooks.add(book);
    }

    public void returnBook (Book book) {
        userBooks.remove(book);
    }

    public void showUsersBooks () {
        System.out.println("User books: ");
        for (Book userBook : userBooks) {
            System.out.println(userBook);
        }
    }

    @Override
    public String toString() {
        return "User " + name + ": login = " + login + ", password: " + password;
    }
}
