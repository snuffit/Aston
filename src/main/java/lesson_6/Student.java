package lesson_6;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private int group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, int group, int course, int mathGrade, int physGrade, int litGrade, int chemGrade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
        grades.put("Математика", mathGrade);
        grades.put("Физика", physGrade);
        grades.put("Литература", litGrade);
        grades.put("Химия", chemGrade);
    }

    public void transferToNextCourse() {
        this.course += 1;
    }

    public String getName() {
        return this.name;
    }

    public int getCourse() {
        return this.course;
    }

    public int getAverageGrade() {
        int averageGrade = 0;
        for (Map.Entry<String, Integer> entry : this.grades.entrySet()) {
            averageGrade += entry.getValue();
        }
        averageGrade /= this.grades.size();
        return averageGrade;
    }

    @Override
    public String toString() {
        return String.format("%s, группа %d, курс %d, средний балл: %d",
                this.name, this.group, this.course, getAverageGrade());
    }
}
