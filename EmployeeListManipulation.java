package java_codes;


import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee {
    private String firstName;
    private String lastName;
    private String gender;
    private int salary;
    private int exp;
    private String city;
}

public class EmployeeListManipulation {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        /*employees.add(new Employee("Luffy","SunGodNika", "Male", 45000, 20, "Red"));
        employees.add(new Employee("Nami", "CatBurglar", "Female", 15000, 15, "Blue"));
        employees.add(new Employee("Zoro","KingOfHell", "Male", 40000, 10, "Red"));
        employees.add(new Employee("Sanji","Germa", "Male", 30000, 10, "Blue"));
        employees.add(new Employee("Sanji","Cook", "Male", 30000, 30, "Blue"));
*/
        /* filter EmployeesByName */
        /*employees.stream()
                .filter(employee -> employee.getName().matches("Luffy"))
                .forEach(System.out::println);*/

        /* ******************************************************************************************** */

        /* filter EmployeesByExp */
        /*employees.stream()
                .filter(employee -> employee.getExp() > 10).forEach(System.out::println);*/

        /* ******************************************************************************************** */

        /* filter EmployeesBySalary */
        /*employees.stream()
                .filter(employee -> employee.getSalary() > 20000)
                .forEach(System.out::println);*/

        /* ******************************************************************************************** */

        /* filter EmployeesByGender */
        /*employees.stream()
                .filter(employee -> employee.getGender().equals("Male")).forEach(System.out::println);*/

        /* ******************************************************************************************** */

        /* filter EmployeesByGenderAndSalary */
        /*employees.stream()
                .filter(employee -> employee.getGender().equals("Male") && employee.getSalary() > 20000)
                .forEach(System.out::println);*/

        /* ******************************************************************************************** */

        /* employeesByCity */
        /*employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity))
                .forEach((city, empList) -> {
                    System.out.print("City: " + city);
                    System.out.println(" count: " + empList.size());
                    empList.forEach(employee -> System.out.println("  - " + employee.getName()));
                });*/

        /* ******************************************************************************************** */

        /* get name of Employees */
        /*employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);*/

        /* ******************************************************************************************** */

        /* get name of Employees, salary >20000 */
        /*employees.stream()
                .filter(employee -> employee.getSalary() > 20000)
                .map(Employee::getName)
                .forEach(System.out::println);*/

        /* ******************************************************************************************** */

        /* get name of Employees, exp > 10 */
        /*employees.stream()
                .filter(employee ->  employee.getExp() > 10)
                .map(Employee::getName)
                .forEach(System.out::println);*/

        /* ******************************************************************************************** */

        /* get name of Employees, salary >20000 && exp > 10 */
        /*employees.stream()
                .filter(employee -> employee.getSalary() > 20000 && employee.getExp() > 10)
                .map(Employee::getName)
                .forEach(System.out::println);*/ // Luffy

        /* ******************************************************************************************** */

        /* get employees data, salary >20000 && exp > 10 */
        /*employees.stream()
                .filter(employee -> employee.getSalary() > 20000 && employee.getExp() > 10)
                .forEach(System.out::println);*/ // Employee(name=Luffy, gender=Male, salary=45000, exp=20, city=Red)

        /* ******************************************************************************************** */

        /* get employees data whose name start with S, salary >10000 && exp > 20 */
        /*employees.stream()
                .filter(emp -> emp.getFirstName().startsWith("S") && emp.getSalary() > 10000 && emp.getExp() > 20)
                .forEach(System.out::println);*/

        /* ******************************************************************************************** */

        /* get employees data whose last name start with K, salary >10000 && exp > 20 */
        employees.stream()
                .filter(emp -> emp.getLastName().startsWith("K") && emp.getSalary() > 10000 )
                .forEach(System.out::println);

    }
}

