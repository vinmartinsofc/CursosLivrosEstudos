package devdojo.exbreak;
//* Interrompa ao atingir um limite de tentativas.

import java.util.Scanner;

public class ExBreak07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        int rand = (int) (Math.random() * 3);
        int secretNumber;

        while (true) {
            if (attempts == 0) {
                System.out.println("Attempt limits reached!");
                break;
            }

            System.out.println("Guess whats the secret number??");
            secretNumber = scanner.nextInt();

            if (secretNumber == rand && attempts == 3) {
                System.out.println("You've done it! You got the secret number in the first attempt, congratulations!: " + secretNumber);
                break;
            }

            if (secretNumber == rand) {
                System.out.printf("You reached the secret number! %d %n", rand);
                System.out.printf("Number of attempts last: %d", attempts);
                break;
            } else {
                System.out.println("Wrong!");
            }
            attempts--;

        }
        scanner.close();

    }
}
