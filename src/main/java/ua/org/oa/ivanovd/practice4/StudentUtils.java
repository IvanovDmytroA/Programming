package ua.org.oa.ivanovd.practice4;

import java.util.*;

/**
 * Created by Администратор on 25.04.2016.
 */
public class StudentUtils {

    List<Student> students = new ArrayList<>();
    Student student = new Student();

    public static Map<String, Student> createMapFromList(List<Student> students){
        HashMap<String, Student> studentHashMap = new HashMap<>();
        for (Student student : students) {
            String studentKey = student.getKey();
            studentHashMap.put(studentKey, student);
        }
        return studentHashMap;
    }


    public static void printStudent (List<Student> students, int course) {
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            if (studentIterator.next().getCourse() == course) {
                System.out.println(studentIterator.toString());
            }
        }
    }


    public static List<Student> sortStudent (List students){

        return null;
    }


    @Override
    public String toString() {
        return "StudentUtils{" +
                "students=" + students +
                ", student=" + student +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentUtils that = (StudentUtils) o;

        if (students != null ? !students.equals(that.students) : that.students != null) return false;
        return student != null ? student.equals(that.student) : that.student == null;

    }

    @Override
    public int hashCode() {
        int result = students != null ? students.hashCode() : 0;
        result = 31 * result + (student != null ? student.hashCode() : 0);
        return result;
    }
}
