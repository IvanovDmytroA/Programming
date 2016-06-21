package ua.org.oa.ivanovd.practice5.students;

import java.io.Serializable;

/**
 * Created by Администратор on 21.06.2016.
 */
public class Student implements Serializable {

    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Override
    public String toString() {
        return "firstName = " + firstName +
                ", lastName = " + lastName;
    }
}
