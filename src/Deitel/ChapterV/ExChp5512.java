package Deitel.ChapterV;

import java.util.Scanner;

public class ExChp5512 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit = 15;
        int total = 0;


        while (limit >= 1) {
            System.out.println("Enter the integer: ");
            int nums = input.nextInt();

            if (nums % 2 > 0) {
                int temp = nums;

                int anotherTemp = temp * nums;

                System.out.printf("%nCalc: %d%n", anotherTemp);

            }

            limit--;
        }

        System.out.printf("%nEnd: %d%n", total);
        input.close();
    }

}
