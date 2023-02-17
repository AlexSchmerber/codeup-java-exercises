package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Stephen");
        student1.addGrade(80);
        student1.addGrade(70);
        System.out.println(student1);
        System.out.println(student1.getGradesAverage());

    }
}
