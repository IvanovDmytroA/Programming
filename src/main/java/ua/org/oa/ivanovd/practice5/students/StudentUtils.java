package ua.org.oa.ivanovd.practice5.students;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Администратор on 21.06.2016.
 */
public class StudentUtils {

    private static String fileWithStudents = "src\\main\\java\\ua\\org\\oa\\ivanovd\\practice5\\students.txt";

    public List<Marks> createListOfStudents() {
        List<Marks> students = new ArrayList<>();
        List<Integer> marks = new ArrayList<>();
        File file = new File(StudentUtils.fileWithStudents);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()){
                String[] strings = scanner.nextLine().split("\\s");
                Marks student = new Marks();
                student.setFirstName(strings[0]);
                student.setLastName(strings[1]);
                marks.add(Integer.parseInt(strings[3]));
                student.setMarks(marks);
                marks = new ArrayList<>();
                this.addStudent(student, students);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public void addStudent(Marks student, List<Marks> list){
        int index = 0;
        Marks addedStudent;
        if(list.size() == 0 || !list.contains(student)){
            list.add(student);
        } else {
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).equals(student)){
                    index = i;
                    break;
                }
            }
            addedStudent = list.get(index);
            addedStudent.getMarks().add(student.getMarks().get(0));
            student.setMarks(addedStudent.getMarks());
            list.set(index, student);
        }
    }

    public List<Marks> checkAverageMark(List<Marks> listWithStudents) {
        List<Marks> studentList = new ArrayList<>();
        for (Marks student : listWithStudents) {
            if (student.average() > 90){
                studentList.add(student);
            }
        }
        return studentList;
    }

    public String toString(List<Marks> listWithStudents){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listWithStudents.size(); i++) {
            if (i == listWithStudents.size() - 1){
                sb.append(listWithStudents.get(i));
            } else {
                sb.append(listWithStudents.get(i)).append('\n');
            }
        }
        return sb.toString();
    }
}
