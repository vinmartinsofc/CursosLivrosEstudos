package devdojo.exwhile;

import java.util.Scanner;

public class While04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        String stopper = "";
        int userInput = 0;

        while (!stopper.equalsIgnoreCase("n")) {

            System.out.println("Num?");
            userInput = input.nextInt();
            count++;
            System.out.println("Continue?? ");
            stopper = input.next();


        }

        System.out.println("You entered " + count + " numbers.");

    }
}
