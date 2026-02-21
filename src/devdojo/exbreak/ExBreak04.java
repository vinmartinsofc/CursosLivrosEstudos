package devdojo.exbreak;

import java.util.Scanner;

public class ExBreak04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opt;


        do {
            System.out.println("1 - Option 1");
            System.out.println("2 - Option 2");
            System.out.println("3 - Option 3");
            System.out.println("4 - Option 4");
            System.out.println("5 - Option 5");
            System.out.println("6 - Sair");
            opt = scanner.next();
        } while (!opt.equalsIgnoreCase("sair"));






    }
}
