package devdojo.exdowhile;

import java.util.Scanner;

public class DoWhile03 {
    public static void main(String[] args) {
        String menu = "-1";
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1 - Buy");
            System.out.println("2 - Sell");
            System.out.println("3 - Rent");
            System.out.println("4 - Shareholder");
            System.out.println("0 - Exit");
            menu = input.next();

        } while (!menu.equals("0"));
    }
}
