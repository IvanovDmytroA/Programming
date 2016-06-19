package ua.org.oa.ivanovd.homework6;

/**
 * Created by Администратор on 19.06.2016.
 */
public class App {

    public static void main(String[] args){
        BookUtils bu = new BookUtils();
        Book book = new Book("Diary", "Chuck Palahniuk", 2013);
        bu.addBookToFile(book);
        System.out.print(bu.toString(bu.showInfoFromFile()));
    }
}
