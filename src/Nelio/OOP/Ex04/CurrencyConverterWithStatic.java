package Nelio.OOP.Ex04;

import java.util.Scanner;

public class CurrencyConverterWithStatic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dollar price: ");
        double exchangeRate = scanner.nextDouble();
        System.out.print("Enter the amount of $US to be bought: ");
        double amountBought = scanner.nextDouble();
        double calc = converter(exchangeRate, amountBought);
        System.out.printf("Amount to be paid in reais:%.2f%n ", calc);

        scanner.close();
    }

    public static double converter(double exchngeRate, double amount) {
        double tax = exchngeRate * amount * 6 / 100;

        return exchngeRate * amount + tax;


    }

}
