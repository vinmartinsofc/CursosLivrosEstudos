package devdojo.exwhile;
//* Simule uma calculadora simples.


import java.util.Scanner;

public class While14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu;
        double n1 = 0;
        double n2 = 0;

        do {
            System.out.printf("%s %-5s %s %n","******* ", "MENU", " *******");
            System.out.println("1 - division");
            System.out.println("2 - multiplication");
            System.out.println("3 - remainder");
            System.out.println("4 - addition");
            System.out.println("5 - subtraction");
            System.out.println("0 - exit");
            menu = scanner.next();

            if (menu.equalsIgnoreCase("1")) {
                System.out.println("Number One? ");
                n1 = scanner.nextDouble();

                System.out.println("Number Two? ");
                n2 = scanner.nextDouble();

                if (n2 > n1) {
                    System.out.printf("Result: %.2f %n", n2 / n1);
                } else {
                    System.out.printf("Result: %.2f %n", n1 / n2);

                }



            }

        } while (!menu.equalsIgnoreCase("0"));

        System.out.println("Leaving...");

        scanner.close();
    }
}
