package CodeRefiner.Ex05;

import java.util.Random;
import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int guess = -1;
        int attempts = 0;

        System.out.println("Guess what's the secret number? ");
        while (guess != secretNumber) {
            guess = scanner.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("The number is lower than that");
            } else if (guess < secretNumber) {
                System.out.println("The number is higher than that");
            } {
                System.out.println("Congratulations!");
            }


        }

        System.out.println("The game has finished.");

        if (attempts <= 3) {
            System.out.println("You finished with " + attempts + " attempts, not bad!");
        } else {
            System.out.println("You should train more, finished with " + attempts + " attempts");
        }


        scanner.close();

    }
}
