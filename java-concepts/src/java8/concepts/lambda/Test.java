package java8.concepts.lambda;

import java.util.List;

public class Test {
    public static void main(String args []) {
        DataService service = new DataService();
        List<Employee> employees = service.getEmployees();

        EmployeeHandler handler = new EmployeeHandler();

        handler.sortByName(employees);
        handler.print(employees);

        handler.print(handler.searchEmployeesByDepartment(employees, "Finance"));
        handler.generatePayroll(employees);

        handler.printEmployeeNamesBasedonCriteria(employees, "A", 5);

        handler.searchYoungestEmployeeByDepartment(employees, "Finance");
    }
}
