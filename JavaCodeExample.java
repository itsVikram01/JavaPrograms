package java_codes;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCodeExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", "walker"));
        studentList.add(new Student("Bob", "Singh"));
        studentList.add(new Student("Alice", "kumar"));
        studentList.add(new Student("Charlie", "Chaplin"));
        studentList.add(new Student("Bob", "Yadav"));


        List<Student> filteredStudents = studentList.stream()
                .collect(Collectors.groupingBy(Student::getFirstName))
                .values().stream().filter(list -> list.size() > 1).flatMap(List::stream).collect(Collectors.toList());

        filteredStudents.forEach( student -> System.out.println(student.getFirstName() + " " + student.getLastName()));

        /*Map<String, Integer> firstNames = new HashMap<>();
        for (Student student : studentList) {
            firstNames.put(student.getFirstName(), firstNames.getOrDefault(student.getFirstName(), 0)+1);
        }*/

        /*Map<String, List<Student>> studentsByFirstName = new HashMap<>();
        for (Student student : studentList) {
            String firstName = student.getFirstName();
            studentsByFirstName.computeIfAbsent(firstName, k -> new ArrayList<>()).add(student);
        }
        for (Map.Entry<String, List<Student>> entry : studentsByFirstName.entrySet()) {
            String firstName = entry.getKey();
            List<Student> students = entry.getValue();
            if (students.size() > 1) {
                System.out.println("Students with first name '" + firstName + "':");
                for (Student student : students) {
                    System.out.println("- " + student.getFirstName());
                }
            }
        }*/

    }
}
