package devdojo.excontinue;

import java.util.Scanner;

public class ExContinue06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        String userPhrase;

        while (!userInput.equals("exit")) {

            System.out.println("Tell me something: ");

            userInput = scanner.next();
            userPhrase = userInput;

            if (userInput.contains("a")) {
                continue;
            } else if (userInput.contains("e")) {
                continue;
            } else if (userInput.contains("i")) {
                continue;
            } else if (userInput.contains("o")) {
                continue;
            } else if (userInput.contains("u")) {
                continue;
            }

            System.out.println("You told me: " + userPhrase);


        }


    }
}
