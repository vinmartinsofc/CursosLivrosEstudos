package devdojo.exwhile;

import java.util.Scanner;

public class While09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double userNumbers;
        int inputAmount = 0;
        double numbersSum = 0;

        while (true) {
            System.out.println("Your Numbers are being generated!");
            userNumbers = Math.random() * 21;
            inputAmount++;
            numbersSum += userNumbers;
            if (inputAmount == 20) {
                break;
            }
        }

        System.out.println("You entered a total of: " + inputAmount + " numbers");
        System.out.println("The total amount is: " + numbersSum);
        System.out.printf("With an average of: %.2f", numbersSum / inputAmount);

    }
}
