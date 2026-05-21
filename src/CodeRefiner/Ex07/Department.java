package CodeRefiner.Ex07;

public class Department  {
    private String name;
    private double budget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double computeSalaryIncreaseBasedOnBudget(double baseSalary) {
        double remainingBudget = this.budget;
        double currentSalary = baseSalary;
        int salaryIncreaseAmount = 0;

        while (remainingBudget >= currentSalary * 0.10) {
            remainingBudget -= currentSalary * 0.10;
            currentSalary *= 1.10;
            salaryIncreaseAmount++;
        }

        return salaryIncreaseAmount;
    }

    @Override
    public String toString() {
        return name;
    }
}
