package deitelHowToProgram10thEd;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ten numbers sequence: ");

        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();
        int inputThree = scanner.nextInt();
        int inputFour = scanner.nextInt();
        int inputFive = scanner.nextInt();
        int inputSix = scanner.nextInt();
        int inputSeven = scanner.nextInt();
        int inputEight = scanner.nextInt();
        int inputNine = scanner.nextInt();
        int inputTen = scanner.nextInt();

        System.out.println("**************************");

        System.out.printf("%-10s %-10s %-10s%n", "Number", "Square", "Cube");
        System.out.printf("%-10d %-10d %-10d%n",
                inputOne,
                inputOne * inputOne,
                inputOne * inputOne * inputOne
        );

        System.out.printf("%-10d %-10d %-10d%n",
                inputTwo,
                inputTwo * inputTwo,
                inputTwo * inputTwo * inputTwo
        );

        System.out.printf("%-10d %-10d %-10d%n",
                inputThree,
                inputThree * inputThree,
                inputThree * inputThree * inputThree
        );

        System.out.printf("%-10d %-10d %-10d%n",
                inputFour,
                inputFour * inputFour,
                inputFour * inputFour * inputFour
        );

        System.out.printf("%-10d %-10d %-10d%n",
                inputFive,
                inputFive * inputFive,
                inputFive * inputFive * inputFive
        );

        System.out.printf("%-10d %-10d %-10d%n",
                inputSix,
                inputSix * inputSix,
                inputSix * inputSix * inputSix
        );

        System.out.printf("%-10d %-10d %-10d%n",
                inputSeven,
                inputSeven * inputSeven,
                inputSeven * inputSeven * inputSeven
        );


        System.out.printf("%-10d %-10d %-10d%n",
                inputEight,
                inputEight * inputEight,
                inputEight * inputEight * inputEight
        );

        System.out.printf("%-10d %-10d %-10d%n",
                inputNine,
                inputNine * inputNine,
                inputNine * inputNine * inputNine
        );

        System.out.printf("%-10d %-10d %-10d%n",
                inputTen,
                inputTen * inputTen,
                inputTen * inputTen * inputTen
        );

    }
}
