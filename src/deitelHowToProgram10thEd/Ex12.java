package deitelHowToProgram10thEd;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sequence?");
        int numero = scanner.nextInt();

        int d1 = numero / 10000;
        int d2 = (numero / 1000) % 10;
        int d3 = (numero / 100) % 10;
        int d4 = (numero / 10) % 10;
        int d5 = numero % 10;

        System.out.println(
                d1 + "   " + d2 + "   " + d3 + "   " + d4 + "   " + d5
        );

        scanner.close();
    }
}
