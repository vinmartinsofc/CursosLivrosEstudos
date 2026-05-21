package CodeRefiner.Ex07;

public class Employee {
    private String name;
    private  double salary;
    private Department department;

    public void increaseSalary(double percentage) {
        double calc = salary * (percentage / 100);
        salary += calc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double computeSalary() {
        return salary / 12;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.printf("Salary: %,.2f%n", computeSalary());
        System.out.println("Department: " + getDepartment().getName());
        System.out.println("Possible increases: " + department.computeSalaryIncreaseBasedOnBudget(salary));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
