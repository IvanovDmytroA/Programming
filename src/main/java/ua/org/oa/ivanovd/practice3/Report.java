package ua.org.oa.ivanovd.practice3;

import java.util.Date;

/**
 * Created by Администратор on 03.06.2016.
 */
public class Report {

    private long id;
    private Book book;
    private User user;

    public Report(long id, Book book, User user) {
        this.id = id;
        this.book = book;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Report: user " + user + " - book " + book;
    }
}
