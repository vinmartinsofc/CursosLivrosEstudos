package IntroductionToJavaProgrammingAndDataStructures11thEditionJava8.elementary.exercises;
/*
Single Filers                Married Filing Jointly                         Head of Household
10%	$0 to $11,925	         $0 to $23,850	                                $0 to $17,000
12%	$11,926 to $48,475	     $23,851 to $96,950                         	$17,001 to $64,850
22%	$48,476 to $103,350	     $96,951 to $206,700                         	$64,851 to $103,350
 */

import java.util.Scanner;

public class IncomeTax01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tax;

        System.out.println("Are you 1-Single? 2-Married or Jointly? 3-Head of Household?");

        int civilStatus = input.nextInt();

        System.out.println("What are your monthly salary??");

        double monthlySalary = input.nextDouble();

        double annualIncome = monthlySalary * 12;

        if (civilStatus == 1 && annualIncome < 11925) {

            tax = (double) 10 / 100 * annualIncome;
            double updateAnnualincome = annualIncome - tax;
            System.out.println("Civil status: Single");
            System.out.println("Tax: 10%");
            System.out.println("Tax: applied: " + updateAnnualincome);
            System.out.println("Income without discount: " + annualIncome);

        } else if (civilStatus == 1 && annualIncome > 11925 && annualIncome < 48475) {

            tax = (double) 12 / 100 * annualIncome;
            double updateAnnualincome = annualIncome - tax;
            System.out.println("Civil status: Single");
            System.out.println("Tax: 12%");
            System.out.println("Tax: applied: " + updateAnnualincome);
            System.out.println("Income without discount: " + annualIncome);


        } else if (civilStatus == 1 && annualIncome > 48475) {

            tax = (double) 22 / 100 * annualIncome;
            double updateAnnualincome = annualIncome - tax;
            System.out.println("Civil status: Single");
            System.out.println("Tax: 22%");
            System.out.println("Tax applied: " + updateAnnualincome);
            System.out.println("Income without discount: " + annualIncome);
        }



        if (civilStatus == 2 && annualIncome < 23850) {

            tax = (double) 10 / 100 * annualIncome;
            double updateAnnualincome = annualIncome - tax;
            System.out.println("Civil status: Maried or jointly");
            System.out.println("Tax: 12%");
            System.out.println("Tax: applied: " + updateAnnualincome);
            System.out.println("Income without discount: " + annualIncome);


        } else if (civilStatus == 2 && annualIncome > 23850 && annualIncome < 96950) {

            tax = (double) 12 / 100 * annualIncome;
            double updateAnnualincome = annualIncome - tax;
            System.out.println("Civil status: Maried or jointly");
            System.out.println("Tax: 12%");
            System.out.println("Tax: applied: " + updateAnnualincome);
            System.out.println("Income without discount: " + annualIncome);


        } else if (civilStatus == 2 && annualIncome > 96950 && annualIncome < 206700) {

            tax = (double) 22 / 100 * annualIncome;
            double updateAnnualincome = annualIncome - tax;
            System.out.println("Civil status: Maried or jointly");
            System.out.println("Tax: 12%");
            System.out.println("Tax: applied: " + updateAnnualincome);
            System.out.println("Income without discount: " + annualIncome);

        }


        if (civilStatus == 3 && annualIncome < 17000) {

            tax = (double) 10 / 100 * annualIncome;
            double updateAnnualincome = annualIncome - tax;
            System.out.println("Civil status: Head of household");
            System.out.println("Tax: 12%");
            System.out.println("Tax: applied: " + updateAnnualincome);
            System.out.println("Income without discount: " + annualIncome);


        } else if (civilStatus == 3 && annualIncome > 23850 && annualIncome < 96950) {

            tax = (double) 12 / 100 * annualIncome;
            double updateAnnualincome = annualIncome - tax;
            System.out.println("Civil status: Head of household");
            System.out.println("Tax: 12%");
            System.out.println("Tax: applied: " + updateAnnualincome);
            System.out.println("Income without discount: " + annualIncome);


        } else if (civilStatus == 3 && annualIncome > 96950) {

            tax = (double) 22 / 100 * annualIncome;
            double updateAnnualincome = annualIncome - tax;
            System.out.println("Civil status: Head of household");
            System.out.println("Tax: 12%");
            System.out.println("Tax: applied: " + updateAnnualincome);
            System.out.println("Income without discount: " + annualIncome);

        }



    }

}
