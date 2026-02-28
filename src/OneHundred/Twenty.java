package OneHundred;

import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int previousNumber = 0;

        System.out.print("Enter the integer: ");
        int userInteger = scanner.nextInt();

        while (userInteger != 0) {

            if (previousNumber == 0) {
                previousNumber = userInteger;
                continue;
            }

            if (userInteger < previousNumber) {
                previousNumber = userInteger;
            }

            System.out.println("Lowest: " + previousNumber);

            System.out.print("Enter the integer: ");
            userInteger = scanner.nextInt();

        }


    }
}
