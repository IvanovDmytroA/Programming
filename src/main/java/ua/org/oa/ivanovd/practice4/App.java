package ua.org.oa.ivanovd.practice4;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 25.04.2016.
 */
public class App {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Valentin" , "Petrov", 3);
        Student student2 = new Student("Vladimir" , "Sidorov", 3);
        Student student3 = new Student("Ilya" , "Anokhin", 2);
        Student student4 = new Student("Dmitriy" , "Vetkov", 3);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("~~~Student Utils~~~");
        System.out.println();

        StudentUtils.creatMapFromList(students);
        System.out.println();

        StudentUtils.printStudent(students, 3);
        System.out.println();

        StudentUtils.sortStudent(students);
        System.out.println();

        System.out.println("~~~Read Utils~~~");
        System.out.println();

        ReadUtils reader = new ReadUtils();
        reader.printWords(reader.uniqueWords());
        System.out.println();
        reader.printWords(reader.uniqueWords(ReadUtils.sortingCriteria.VALUE_DOWN));
    }
}
