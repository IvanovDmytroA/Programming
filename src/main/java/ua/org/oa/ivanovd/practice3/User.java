package ua.org.oa.ivanovd.practice3;


import java.util.Date;
import java.util.List;

/**
 * Created by Администратор on 03.06.2016.
 */
public class User {

    private long id;
    private String name;
    private String login;
    private String password;
    private List<Book> books;

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
