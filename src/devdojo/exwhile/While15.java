package devdojo.exwhile;

import java.util.Scanner;

public class While15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum;


        do {
            System.out.println("Enter the desired number: ");
            userNum = scanner.nextInt();

            if (userNum != 0) {
                System.out.println("Reading: " + userNum);
            }

        } while (userNum != 0);

        System.out.println("You've left!");
        scanner.close();
    }
}
