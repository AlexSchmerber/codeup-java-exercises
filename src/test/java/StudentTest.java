import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.testng.AssertJUnit.*;

public class StudentTest {

    private Student studentTest;

    private final ArrayList<Integer> testArray = new ArrayList<>();


    @Before
    public void setup(){
        studentTest = new Student(111, "test");
        studentTest.addGrade(5);
        studentTest.addGrade(10);
        testArray.add(5);
        testArray.add(10);
    }

    @Test
    public void testgetID(){
        assertEquals(111, studentTest.getId());
    }

    @Test
    public void testgetName(){
        assertEquals("test", studentTest.getName());
    }

    @Test
    public void testAddGrade(){
        assertEquals(studentTest.getGrades(), testArray);
    }

    @Test
    public void testGetGrades(){
        assertEquals(5, (int) studentTest.getGrades().get(0));
    }

    @Test
    public void testGetGradeAverage(){
        assertEquals(7.5, studentTest.getGradeAverage());
    }
}