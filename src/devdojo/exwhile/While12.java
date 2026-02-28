package devdojo.exwhile;

import java.util.Scanner;

public class While12 {
    public static void main(String[] args) {
        int count = 0;
        int nums;
        int iterationLimit = (int) (Math.random() * 51);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Friendly welcome msg: ");
            nums = scanner.nextInt();

            System.out.println("number: " + nums);

            count++;
        } while (count != iterationLimit);


        System.out.println(count + " total numbers entered");

    }
}
