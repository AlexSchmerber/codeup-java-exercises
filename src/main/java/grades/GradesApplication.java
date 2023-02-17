package grades;
import util.Input;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {
    static HashMap<String, Student> students = new HashMap<>();
    private static Input sc = new Input();
    public static void main(String[] args) {
        Student student1 = new Student("matt");
        Student student2 = new Student("joey");
        Student student3 = new Student("shawn");
        student1.addGrade(78);
        student1.addGrade(68);
        student1.addGrade(58);
        student2.addGrade(72);
        student2.addGrade(62);
        student2.addGrade(52);
        student3.addGrade(71);
        student3.addGrade(61);
        student3.addGrade(51);
        students.put("mattgithub", student1);
        students.put("githubjoey", student2);
        students.put("gitshawnhub", student3);
        System.out.print("Welcome, here is a list of students github accounts:\n");
        checkStudent();
        Input.sc.close();
    }
    private static void checkStudent(){
        returnStudent();
        String userStudentSearch = sc.getString("Which student would you like to see more information on?\n");
        if(students.containsKey(userStudentSearch)){
            students.get(userStudentSearch);
        } else {
            String continueResponse = sc.getString("No matches for " + userStudentSearch + "\nContinue search (y/n)?");
            if ("y".equalsIgnoreCase(continueResponse)){
                checkStudent();
            }
        }
    }
    private static void returnStudent(){
        for(String key: students.keySet()){
            System.out.println(key);
        }
    }
}
