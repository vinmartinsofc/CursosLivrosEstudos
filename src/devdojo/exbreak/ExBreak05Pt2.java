package devdojo.exbreak;

import java.util.Scanner;

public class ExBreak05Pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the sequence (eg: 1598): ");
            var sequence = scanner.nextInt();

            var calculationOne = sequence / 1000 % 10;
            var calculationTwo = sequence / 100 % 10;
            var calculationThree = sequence / 10 % 10;
            var calculationFour = sequence / 1 % 10;

            System.out.printf("%-2d %-2d %-2d %-2d %n", calculationOne, calculationTwo, calculationThree, calculationFour);

            if (calculationOne % 2 == 0) {
                System.out.println("Firt Integer is pair!");
                break;
            }

        }
        scanner.close();

    }

}
