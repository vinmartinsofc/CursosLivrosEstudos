package devdojo.exdowhile;

import java.util.Scanner;

public class DoWhile05 {
    public static void main(String[] args) {
        int correctPassword = 5000;
        int rand;
        Scanner input = new Scanner(System.in);

        do {
            rand = (int) (Math.random() * 100001);

            System.out.println("Generated password: " + rand);

        } while (rand != correctPassword);


        System.out.println("Correct Password Reached!" + correctPassword);

    }
}
