package ua.org.oa.ivanovd.practice4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 25.04.2016.
 */
public class Student {
    private String firstName;
    private String secondName;
    private int course;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    public Student(){

    }

    public Student (String firstName, String secondName, int course) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.course = course;
    }

    public String getKey(){
        String keyForMap = getFirstName() + " " + getSecondName();
        return keyForMap;
    }



    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        return secondName != null ? secondName.equals(student.secondName) : student.secondName == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + course;
        return result;
    }
}
