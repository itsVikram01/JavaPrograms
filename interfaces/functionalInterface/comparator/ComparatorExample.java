package java_codes.interfaces.functionalInterface.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(22, "Alice"));
        students.add(new Student(18, "Bob"));
        students.add(new Student(25, "Charlie"));

        // Sort students by age using a comparator
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.age - s2.age;
            }
        });

        // Print sorted students
        for (Student student : students) {
            System.out.println(student.age + " " + student.name);
        }

    }
}