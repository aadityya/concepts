package java8.concepts.lambda;

public class Employee {
    private long id;
    private String name;
    private int age;
    private String department;

    public Employee(long id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
