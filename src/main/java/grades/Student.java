package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + grades;
    }

    public int getGradesAverage() {
        float avg = 0;
        for (Integer grade : grades) {
            avg += grade;
        }
        return (int) (avg / grades.size());
    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

}
