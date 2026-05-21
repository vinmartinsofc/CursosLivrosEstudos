package Skips;
//Skipped

import java.util.Scanner;

public class ExChap5516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integers separated by space between 5 and 30 (eg: 28 19 11 17 7): ");
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        System.out.println("*".repeat(number));
        System.out.println("*".repeat(number2));
        System.out.println("*".repeat(number3));
        System.out.println("*".repeat(number4));
        System.out.println("*".repeat(number5));

        scanner.close();
    }
}