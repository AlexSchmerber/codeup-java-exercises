import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Array;

import java.util.ArrayList;

import static org.testng.AssertJUnit.*;

public class CohortTest {

    private Student studentTest1;

    private Student studentTest2;

    private Student studentTest3;

    private Cohort cohortTest;

    private final ArrayList<Integer> testArray = new ArrayList<>();


    @Before
    public void setup(){
        studentTest1 = new Student(1, "test1");
        studentTest2 = new Student(1, "test2");
        studentTest3 = new Student(1, "test3");
        studentTest1.addGrade(10);
        studentTest1.addGrade(60);
        studentTest2.addGrade(50);
        studentTest2.addGrade(40);
        studentTest3.addGrade(50);
        studentTest3.addGrade(60);
        cohortTest = new Cohort();
    }

    @Test
    public void testGetStudent(){
        cohortTest.addStudent(studentTest1);
        assertEquals(cohortTest.getStudents().get(0), studentTest1);
    }

    @Test
    public void testAddStudent(){
        cohortTest.addStudent(studentTest1);
        assertEquals(cohortTest.getStudents().size(), 1);
    }

    @Test
    public void testAverageGradeOfStudents(){
        cohortTest.addStudent(studentTest1);
        cohortTest.addStudent(studentTest2);
        cohortTest.addStudent(studentTest3);

        assertEquals(cohortTest.getCohortAverage(), 45.0);
    }


}
