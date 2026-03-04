package devdojo.excontinue;

import java.util.Scanner;

public class ExContinue08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {

            System.out.println("Enter the string you want: ");
            String userInput = input.nextLine();

            if (userInput.trim().isEmpty()) {
                System.out.println("You said nothing");
                continue;
            }

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("You said: " + userInput);

        }

    }
}
