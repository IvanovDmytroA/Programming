package ua.org.oa.ivanovd.practice1;

/**
 * Created by Администратор on 26.05.2016.
 */
public class Student {
    private String firstName;
    private String lastName;
    private Group group;
    private Exam[] exam;

    public Student(String firstName, String lastName, Group group, Exam[] exam){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.exam = exam;
    }

    public int getHighestMark(String subject){
        int highestMark = 0;
        for (Exam ex : exam) {
            if(ex.getSubjectName().equals(subject) && highestMark < ex.getMark()){
                highestMark = ex.getMark();
            }
        }
        return highestMark;
    }

    public void deleteMark(String subjectName){
        for (Exam ex : exam) {
            if (ex.getSubjectName().equals(subjectName)) {
                ex.setMark(0);
            }
        }
    }

    public void setMark(int mark, String subjectName){
        for (Exam ex : exam) {
            if (ex.getSubjectName().equals(subjectName)) {
                ex.setMark(mark);
            }
        }
    }

    public int getCountOfExam(int mark){
        int count = 0;
        for (Exam ex : exam) {
            if (ex.getMark() == mark){
                count++;
            }
        }
        return count;
    }

    public double getAverageMark(){
        int count = 0;
        int genMark = 0;
        for (Exam ex : exam) {
            count++;
            genMark += ex.getMark();
        }
        return genMark / (count * 1.0);
    }

    public boolean isPassed(String subjectName) throws Exception{
        boolean isPassed;
        for (Exam ex : exam) {
            if (subjectName.equals(ex.getSubjectName())){
                isPassed = true;
                return isPassed;
            }
        }
        throw new Exception();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student: " + firstName + " " + lastName + ", group " + group + ".\nExams: ");
        for (Exam exam1 : exam) {
            sb.append(exam1.toString());
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception{
        Student student = new Student("Dmytro", "Ivanov",
                new Group(3, "Managment and administration"),
                new Exam[]{new Exam(4, "Managment", "25.12.2015"),
                        new Exam(4, "Marketing", "27.12.2015"),
                        new Exam(5, "Macroeconomics", "22.12.2015"),
                        new Exam(4, "Team Management", "20.12.2015")});
        System.out.println(student.isPassed("Managment and administration"));
    }
}
