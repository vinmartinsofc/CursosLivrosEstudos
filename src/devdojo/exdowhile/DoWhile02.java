package devdojo.exdowhile;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        int userInput = -1;
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        do {
            System.out.println("Which number would you like me to read? ");
            userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput + ", you can close at any time by pressing 0");
            count++;
        } while (userInput != 0);


        System.out.println("Total numbers entered: " + count);

    }
}
