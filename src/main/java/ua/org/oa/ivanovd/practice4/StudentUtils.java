package ua.org.oa.ivanovd.practice4;

import java.util.*;

/**
 * Created by Администратор on 06.06.2016.
 */
public class StudentUtils {

    public static Map<String, Student> creatMapFromList (List<Student> students) {
        Map<String, Student> student = new HashMap<>();
        for (Student stud : students) {
            student.put(stud.getFirstName() + " " + stud.getLastName(), stud);
        }
        for (Map.Entry<String, Student> entry : student.entrySet()) {
            System.out.println(entry);
        }
        return student;
    }

    public static void printStudent (List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
            Student st = iterator.next();
            if (st.getCourse() == course) {
                System.out.println(st.getFirstName() + " " + st.getLastName());
            }
        }
    }

    public static List<Student> sortStudent (List<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getFirstName().compareTo(student2.getFirstName());
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }
        return students;
    }


}
