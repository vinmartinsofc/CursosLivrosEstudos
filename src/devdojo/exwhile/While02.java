package devdojo.exwhile;

import java.util.Scanner;

//* Leia números até que o usuário digite 0.

public class While02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int userInput;

        do {
            System.out.println("???");
            userInput = input.nextInt();
            System.out.println("You entered: " + userInput);
        } while (userInput != 0);

    }
}
