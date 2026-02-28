package devdojo.exbreak;

import java.util.Scanner;

public class ExBreak03 {
    public static void main(String[] args) {
        int userInput;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the desired number sequence (eg: 357): ");
            userInput = scanner.nextInt();

            int n1 = userInput / 100 % 10;
            int n2 = userInput / 10 % 10;
            int n3 = userInput % 10;

            System.out.printf("n1: %-3d n2: %-3d n3: %-3d %n", n1, n2, n3);

            if (n3 > 0 && n3 <= 3) {
                System.out.println("Stop condition reached (Last integer: 1, 2 or 3).");
                break;
            }

        }

        scanner.close();

    }
}
