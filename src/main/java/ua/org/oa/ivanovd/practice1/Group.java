package ua.org.oa.ivanovd.practice1;

/**
 * Created by Администратор on 26.05.2016.
 */
public class Group {
    private int course;
    private String faculty;

    public Group(int course, String faculty){
        this.course = course;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "course = " + course + ", faculty = " + faculty;
    }
}
