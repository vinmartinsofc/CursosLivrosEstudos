package devdojo.exwhile;

import java.util.Scanner;

public class While07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("Whats the password??");
            userInput = input.next();
        } while (!userInput.equalsIgnoreCase("swordfish"));

    }
}
