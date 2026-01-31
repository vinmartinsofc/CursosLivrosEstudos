package devdojo.excondicionais;

/*
 * Leia um salário e calcule o aumento:
 * até 2000 → +10%
 * acima de 2000 → +5%
 */

import java.util.Scanner;

public class Condicionais04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Whats the salary?");

        double salary = input.nextDouble();

        System.out.println("Your salary is: " + salary);

        if (salary <= 2000.0) {
            double salaryUpdate = salary * 10 / 100;
            salary += salaryUpdate;
            System.out.println("Salary with 10% increase: " + salary);
        } else if (salary > 2000.0) {
            double salaryUpdate = salary * 5 / 100;
            salary += salaryUpdate;
            System.out.println("Salary with 5% increase: " + salary);
        }


    }
}
