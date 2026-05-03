package CodeCalisthenics;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, count = 0;
        double avg;

        System.out.print("Enter the integer (-1 to quit): ");
        int hasEntered = scanner.nextInt();

        while (hasEntered != -1) {

            if (hasEntered < 0) {
                System.out.println("Only positives allowed.");
            } else {
                total += hasEntered;
                count += 1;
            }

            System.out.print("Enter the integer (-1 to quit): ");
            hasEntered = scanner.nextInt();
        }

        if (count <= 0) {
            System.out.println("No integers entered.");
        } else {
            avg = (double) total / count;
            System.out.printf("%nTotal integers: %d%nSum: %d%nAvg: %.2f%n " , count, total, avg);
        }

        scanner.close();
    }
}
