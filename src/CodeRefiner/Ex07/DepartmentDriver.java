package CodeRefiner.Ex07;

public class DepartmentDriver {
    public static void main(String[] args) {

        Department personal = new Department();
        personal.setName("Personal");
        personal.setBudget(50000);

        Department hiring = new Department();
        hiring.setName("Hiring");
        hiring.setBudget(30000);


        Employee johnDoe = new Employee();
        johnDoe.setName("John Doe");
        johnDoe.setSalary(70000);
        johnDoe.setDepartment(personal);
        johnDoe.increaseSalary(4);
        johnDoe.displayInfo();

        Employee nedStark = new Employee();
        nedStark.setName("Ned Stark");
        nedStark.setSalary(85000);
        nedStark.setDepartment(hiring);
        nedStark.increaseSalary(10);
        nedStark.displayInfo();


    }
}
