package ua.org.oa.ivanovd.practice4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 25.04.2016.
 */
public class App {
    public static void main(String[] args) {

        List<Student> myStudentList = new ArrayList<>();

        myStudentList.add(new Student("John", "Moore", 4));
        myStudentList.add(new Student("Frank", "Williams", 3));
        myStudentList.add(new Student("Matt", "Barton", 4));
        myStudentList.add(new Student("Jason", "Voorhees", 4));
        myStudentList.add(new Student("Ed", "Boon", 5));
        myStudentList.add(new Student("Juan", "Garcia", 4));

        StudentUtils.printStudent(myStudentList, 4);

    }
}
