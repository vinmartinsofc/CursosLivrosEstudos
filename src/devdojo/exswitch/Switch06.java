package devdojo.exswitch;

import java.util.Scanner;

public class Switch06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1, 2, or 3?");

        int random = (int) (Math.random() * 3);

        System.out.println(random);

        switch (random) {
            case 0:
                System.out.println("Admin.");
                break;
            case 1:
                System.out.println("User.");
                break;
            case 2:
                System.out.println("Visitor");
                break;
            default:
                System.out.println("Invalid");
        }


    }
}
