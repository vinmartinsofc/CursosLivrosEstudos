package alura.exercices1;

import java.util.Scanner;

public class AverageNotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double division;

        System.out.println("First note? ");

        double firstNote = input.nextDouble();

        System.out.println("Second note? ");

        double secondNote = input.nextDouble();

        if (firstNote < secondNote) {

            division = secondNote / firstNote;
            System.out.println("Result: " + division);
            return;
        }

         division = firstNote / secondNote;

        System.out.println("Result: " + division);


    }

}
