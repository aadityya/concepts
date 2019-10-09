package java8.concepts.lambda;

@FunctionalInterface
public interface EmployeeService<Employee> {
    public String generatePayroll(Employee emp);

    public static int getLeaveBalance() {
        return 0;
    }
}
