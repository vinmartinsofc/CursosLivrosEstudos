package CodeRefiner;

import java.util.Scanner;

public class Ex04MenuSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialBalance = 1000.0;
        int userOption = -1;

        while (userOption != 4) {

            System.out.printf("%s%n%s%n%s%n%s%n%s%n",
                    "Pick one of the options below: ",
                    "1 - Check Balance",
                    "2 - Deposit",
                    "3 - Withdraw",
                    "4 - exit"
            );
            userOption = scanner.nextInt();


            switch (userOption) {
                case 1:
                    System.out.println("Your balance is: " + initialBalance);
                    break;
                case 2: {
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = scanner.nextInt();
                    initialBalance += depositAmount;
                    System.out.println("Your balance now is: " + initialBalance);
                }
                break;
                case 3: {
                    System.out.print("Enter the withdraw amount: ");
                    double withdrawAmount = scanner.nextInt();

                    if (withdrawAmount > initialBalance) {
                        System.out.println("Insuficient funds..");
                    } else {
                        initialBalance -= withdrawAmount;
                        System.out.println("Your balance now is: " + initialBalance);
                    }
                }
                break;
                case 4:
                    System.out.println("Closing....");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }

        }


        scanner.close();
    }


}
