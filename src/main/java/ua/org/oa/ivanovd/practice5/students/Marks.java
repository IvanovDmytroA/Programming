package ua.org.oa.ivanovd.practice5.students;

import java.util.List;

/**
 * Created by Администратор on 21.06.2016.
 */
public class Marks {

    private String firstName;
    private String lastName;
    private List<Integer> marks;

    public Marks(){

    }

    public Marks(String firstName, String lastName, List<Integer> marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public double average(){
        double allMarks = 0;
        for (Integer integer : marks) {
            allMarks += integer;
        }
        return allMarks / marks.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Marks student = (Marks) o;

        return firstName.equals(student.firstName) && lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (marks != null ? marks.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", marks=" + marks;
    }
}
