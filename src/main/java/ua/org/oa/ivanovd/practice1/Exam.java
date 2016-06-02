package ua.org.oa.ivanovd.practice1;

/**
 * Created by Администратор on 26.05.2016.
 */
public class Exam {
    private int mark;
    private String subjectName;
    private String date;

    public Exam(int mark, String subjectName, String date) {
        this.subjectName = subjectName;
        this.mark = mark;
        this.date = date;
    }

    public void setMark(int mark){
        this.mark = mark;
    }

    public int getMark(){
        return mark;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public String toString() {
        return "nameOfExam = " + subjectName + ", mark = " + mark + ", date = " + date + "; ";
    }
}
