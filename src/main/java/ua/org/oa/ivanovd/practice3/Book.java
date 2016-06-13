package ua.org.oa.ivanovd.practice3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 03.06.2016.
 */
public class Book {

    private long id;
    private String author;
    private String title;
    List<User> users = new ArrayList<>();
    List<Report> reports = new ArrayList<>();

    public Book(long id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public List<User> usersReport(User user) {
        users.add(user);
        System.out.println("Book report:");
        return users;
    }

    public List<Report> bookReport (Report report) {
        reports.add(report);
        return reports;
    }


    @Override
    public String toString() {
        return "Book: " + "id = " + id + "; " + author + ", " + title;
    }
}
