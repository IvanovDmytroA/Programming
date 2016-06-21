package ua.org.oa.ivanovd.practice5.students;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 21.06.2016.
 */
public class Group implements Serializable{

    private List<Student> list = new ArrayList<>();

    public void addStudent(Student student){
        list.add(student);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Group: \n");
        for (Student student : list) {
            sb.append(student).append('\n');
        }
        return sb.toString();
    }
}
