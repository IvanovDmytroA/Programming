package ua.org.oa.ivanovd.practice1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Администратор on 26.05.2016.
 */
public class StudentTest {

    Student student = new Student("Dmytro", "Ivanov",
            new Group(3, "Managment and administration"),
            new Exam[]{new Exam(5, "Managment", "25.12.2015"),
                    new Exam(4, "Marketing", "27.12.2015"),
                    new Exam(5, "Macroeconomics", "22.12.2015"),
                    new Exam(4, "Team Management", "20.12.2015")});

    @Test
    public void testGetHighestMark() throws Exception {
        assertEquals(5, student.getHighestMark("Managment"), 0.01);
    }

    @Test
    public void testDeleteMark() throws Exception {
        student.deleteMark("Marketing");
    }

    @Test
    public void testSetMark() throws Exception {
        student.setMark(5, "Marketing");
    }

    @Test
    public void testGetCountOfExam() throws Exception {
        assertEquals(2, student.getCountOfExam(4), 0.01);
    }

    @Test
    public void testGetAverageMark() throws Exception {
        student.getAverageMark();
    }

    @Test(expected = java.lang.Exception.class)
    public void testIsPassed() throws Exception {
        student.isPassed("Administration");
    }
}