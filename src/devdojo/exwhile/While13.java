package devdojo.exwhile;

import java.util.Scanner;
//* Leia notas até que o usuário decida parar.

public class While13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {

            userInput = scanner.next();

            System.out.println("You entered: " + userInput);

        } while (!userInput.equals("-1"));

        System.out.println("Stopped.");

    }
}
