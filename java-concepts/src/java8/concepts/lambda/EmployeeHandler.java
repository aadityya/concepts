package java8.concepts.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeHandler {

    /**
     *
     * @param employees
     */
    public void sortByName(List<Employee> employees) {

        //Traditional
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        //Lambda
        Collections.sort(employees, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));

        //Variations
        Comparator<Employee> empComparator = (emp1, emp2) -> emp1.getName().compareTo(emp2.getName());
        Collections.sort(employees, empComparator);

        Collections.sort(employees, (emp1, emp2) -> { return emp1.getName().compareTo(emp2.getName()); });

        Collections.sort(employees, EmployeeHandler::sort);
    }

    /**
     *
     * @param e1
     * @param e2
     * @return
     */
    private static int sort(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }

    public void print(List<Employee> employees) {
        employees.forEach(employee -> System.out.format("Id : %s,  Name : %s \n", employee.getId(), employee.getName()));
        System.out.println("-----------------------------------");
    }

    public List<Employee> searchEmployeesByDepartment(List<Employee> employees, String department) {
        return employees.stream().filter(emp-> emp.getDepartment().equals(department)).collect(Collectors.toList());
    }

    public void searchYoungestEmployeeByDepartment(List<Employee> employees, String department) {
        Employee empl = employees.stream().filter(emp->
                emp.getDepartment().equals(department))
                .min((emp1, emp2) -> ((Integer)emp1.getAge()).compareTo((Integer)emp2.getAge()))
                .get();
        System.out.println(empl.getName());

    }

    public void generatePayroll(List<Employee> employees) {
        EmployeeService<Employee> empService = e -> { return "Payroll generated successfully for " + e.getName(); };
        employees.forEach(emp -> System.out.println(empService.generatePayroll(emp)));
        employees.forEach(emp -> System.out.println(EmployeeService.getLeaveBalance()));
    }

    public void printEmployeeNamesBasedonCriteria(List<Employee> employees, String s, int length) {
        Predicate<Employee> startsWith = emp -> emp.getName().startsWith(s);
        Predicate<Employee> doesNotStartWith = startsWith.negate();
        Predicate<Employee> hasLengthOf = emp -> emp.getName().length() == length;

        employees.forEach(emp -> {
            if(startsWith.and(hasLengthOf).test(emp)) {
                System.out.println(emp.getName());
            }
        });

        System.out.println("-----------------------------------");

        employees.forEach(emp -> {
            if(doesNotStartWith.test(emp)) {
                System.out.println(emp.getName());
            }
        });
        System.out.println("-----------------------------------");
    }
}
