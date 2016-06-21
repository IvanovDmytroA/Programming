package ua.org.oa.ivanovd.practice5.students;

import java.io.IOException;

/**
 * Created by Администратор on 21.06.2016.
 */
public class App {

    public static void main(String[] args) throws IOException{
        StudentUtils studentUtil = new StudentUtils();
        System.out.println(studentUtil.toString(studentUtil.checkAverageMark(studentUtil.createListOfStudents())));
    }
}
