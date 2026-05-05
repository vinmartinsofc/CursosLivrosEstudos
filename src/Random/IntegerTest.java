package Random;

import java.util.Scanner;

public class IntegerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enther the integer (you can leave by pressing 'leave' ) : ");
        String userInput = scanner.nextLine();


        while (!userInput.equalsIgnoreCase("leave") && !userInput.equalsIgnoreCase("4")) {

            int conversion = Integer.parseInt(userInput);

            System.out.println("User has entered: " + conversion);

            System.out.println("Enther the integer (you can leave by pressing 'leave' ) : ");
             userInput = scanner.nextLine();

        }





    }
}
