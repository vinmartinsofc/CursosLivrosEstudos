package devdojo.exdebug;

import java.util.Scanner;

public class ExDebug06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer");
        int n1 = scanner.nextInt();

        System.out.println("Enter the second integer");
        int n2 = scanner.nextInt();

        int division = (n1 + n2) / 2;

        System.out.println(division);



    }
}
