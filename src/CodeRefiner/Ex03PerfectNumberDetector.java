package CodeRefiner;

//Um número perfeito é igual à soma de seus divisores próprios.

//Semi Drop

import java.util.Scanner;

public class Ex03PerfectNumberDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        System.out.println("What's the integer: ");
        int choosenInteger = scanner.nextInt();

        while (count < choosenInteger) {

            if (choosenInteger % count == 0) {
                System.out.println("Divded by: " + count);
                sum += count;
            }


            if (sum == choosenInteger) {
                System.out.println("Match!");
                break;
            }


            count++;
        }


        scanner.close();
    }
}
