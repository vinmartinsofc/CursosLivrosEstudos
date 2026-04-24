package Deitel.ChapterV;

import java.util.Scanner;

public class ExChap5516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integers (5-30): ");

        for (int i = 1; i <= 5; i++) {
            int number = scanner.nextInt();

            for (int j = 1; j <= number; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}