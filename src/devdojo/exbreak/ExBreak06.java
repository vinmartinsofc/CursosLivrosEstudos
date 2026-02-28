package devdojo.exbreak;

import java.util.Scanner;

public class ExBreak06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double userNotes;

        while (true) {
            System.out.println("Notes??");
            userNotes = scanner.nextDouble();

            if (userNotes < 6) {
                break;
            }

        }

    }
}
