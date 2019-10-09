package java8.concepts.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataService {
    public List<Employee> getEmployees() {
        return Arrays.asList(new Employee(1, "Peter", 16, "HR"),
                new Employee(7, "James", 12, "Finance"),
                new Employee(4, "Anand", 23, "IT"),
                new Employee(10, "Adam", 35, "Finance"));
    }
}
