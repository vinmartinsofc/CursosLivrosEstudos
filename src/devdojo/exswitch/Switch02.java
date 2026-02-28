package devdojo.exswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a letra");

        String choosenLetter = input.nextLine();

        System.out.println(choosenLetter);

        switch (choosenLetter) {
            case "a": case "e": case "i": case "o": case "u":
                System.out.println("Vogal!");
            default:
                System.out.println("Consoante.");

        }



    }
}
