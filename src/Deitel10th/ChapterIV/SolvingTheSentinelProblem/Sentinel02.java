package Deitel10th.ChapterIV.SolvingTheSentinelProblem;

import java.util.Scanner;

public class Sentinel02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int highest = 0;

        System.out.print("Enter the integer or -1 to exit: ");
        int userInteger = input.nextInt();

        while (userInteger != -1) {

            if (userInteger > highest) {
                highest = userInteger;
            }
            System.out.print("Enter the integer or -1 to quit: ");
            userInteger = input.nextInt();
        }

        if (highest > 0) {
            System.out.println("Highest number is: " + highest);
        } else {
            System.out.println("Any integer entered");
        }

    }
}
