package java_codes.java8.functionalInterface.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.System.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(22, "Alice"));
        students.add(new Student(18, "Bob"));
        students.add(new Student(25, "Charlie"));

        // Sort students by age using a comparator
        students.sort(Comparator.comparingInt(s -> s.age));

        // Print sorted students
        for (Student student : students) {
            out.println(student.age + " " + student.name);
        }

    }
}