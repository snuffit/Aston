package lesson_6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Task 1
        Set<Student> students = new HashSet<>();
        students.add(new Student("Igor", 4, 2,
                3, 4, 5, 5));
        students.add(new Student("Vitya", 3, 1,
                3, 4, 2, 2));
        students.add(new Student("Tolik", 4, 2,
                3, 4, 5, 3));
        students.add(new Student("Petr", 1, 3,
                3, 1, 5, 2));
        System.out.println("--------Все студенты--------");
        printStudentInfo(students);
        System.out.println("--------После перевода на следующий курс--------");
        transferToNextCourse(students);
        printStudentInfo(students);
        System.out.println("--------После удаления неуспевающих--------");
        delUFailingStudents(students);
        printStudentInfo(students);
        System.out.println("--------Студенты 3 курса--------");
        printStudents(students, 3);
        System.out.println("---------------------------------");
        //Task 2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "+3752947889990");
        phoneBook.add("Petrov", "+3752947883421");
        phoneBook.add("Ivanov", "+3752947954678");
        phoneBook.get("Petrov");
        phoneBook.get("Ivanov");
    }

    public static void delUFailingStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public static void transferToNextCourse(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.transferToNextCourse();
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        System.out.printf("На %d курсе обучаются:\n", course);
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void printStudentInfo(Set<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
