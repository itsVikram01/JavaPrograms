package java_codes.collectionFramework.iterable.collection.list;


import java_codes.collectionFramework.iterable.collection.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class EmployeeListManipulation {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Luffy", "Male", 45000, 20, "Red"));
        employees.add(new Employee("Nami", "Female", 15000, 15, "Blue"));
        employees.add(new Employee("Zoro", "Male", 40000, 10, "Red"));
        employees.add(new Employee("Sanji", "Male", 30000, 10, "Blue"));

        List<Employee> filteredEmployeesByName = employees.stream()
                .filter(employee -> employee.getName().matches("Luffy")).toList();
        filteredEmployeesByName.forEach(out::println);
        out.println(" ");

        /* ******************************************************************************************** */

        List<Employee> filteredEmployeesByGender = employees.stream()
                .filter(employee -> employee.getGender().equals("Male")).toList();
        filteredEmployeesByGender.forEach(out::println);
        out.println(" ");

        /* ******************************************************************************************** */

        List<Employee> filteredEmployeesBySalary = employees.stream()
                .filter(employee -> employee.getSalary() > 20000).toList();
        filteredEmployeesBySalary.forEach(out::println);
        out.println(" ");

        /* ******************************************************************************************** */

        List<Employee> filteredEmployeesByGenderAndSalary = employees.stream()
                .filter(employee -> employee.getGender().equals("Male") && employee.getSalary() > 20000).toList();
        filteredEmployeesByGenderAndSalary.forEach(out::println);
        out.println(" ");

        /* ******************************************************************************************** */

        List<Employee> filteredEmployeesByExp = employees.stream()
                .filter(employee -> employee.getExp() > 10).toList();
        filteredEmployeesByExp.forEach(out::println);
        out.println(" ");

        /* ******************************************************************************************** */

        Map<String, List<Employee>> employeesByCity = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity));
        employeesByCity.forEach((city, empList) -> {
            out.print("City: " + city);
            out.println(" count: " + empList.size());
            empList.forEach(employee -> out.println("  - " + employee.getName()));
        });
        out.println(" ");

        /* ******************************************************************************************** */

        employees.stream()
                .map(Employee::getName)
                .forEach(out::println);
        out.println(" ");

        employees.stream()
                .filter(employee -> employee.getSalary() > 20000)
                .map(Employee::getName)
                .forEach(out::println);
        out.println(" ");

        employees.stream()
                .filter(employee ->  employee.getExp() > 10)
                .map(Employee::getName)
                .forEach(out::println);
        out.println(" ");

        employees.stream()
                .filter(employee -> employee.getSalary() > 20000 && employee.getExp() > 10)
                .forEach(out::println); // output : Employee(name=Luffy, gender=Male, salary=45000, exp=20, city=Red)
        out.println(" ");

        employees.stream()
                .filter(employee -> employee.getSalary() > 20000 && employee.getExp() > 10)
                .map(Employee::getName)
                .forEach(out::println); // output : Luffy

    }
}

