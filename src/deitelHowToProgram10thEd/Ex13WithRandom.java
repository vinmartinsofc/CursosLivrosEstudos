package deitelHowToProgram10thEd;

import java.util.Scanner;

public class Ex13WithRandom {
    public static void main(String[] args) {

        int inputOne = 0;
        int inputTwo = 0;
        int inputThree = 0;
        int inputFour = 0;
        int inputFive = 0;
        int inputSix = 0;
        int inputSeven = 0;
        int inputEight = 0;
        int inputNine = 0;
        int inputTen = 0;
        int randomNumbers;

        for (int i = 0; i < 10; i++) {
            randomNumbers = (int) (Math.random() * 50);
            if (i == 0) {
                inputOne = randomNumbers;
                System.out.println("Number One: " + inputOne);
            }

            if (i == 1) {
                inputTwo = randomNumbers;
                System.out.println("Number Two: " + inputTwo);
            }

            if (i == 2) {
                inputThree = randomNumbers;
                System.out.println("Number Three: " + inputThree);
            }

            if (i == 3) {
                inputFour = randomNumbers;
                System.out.println("Number Four: " + inputFour);
            }

            if (i == 4) {
                inputFive = randomNumbers;
                System.out.println("Number Five: " + inputFive);
            }

            if (i == 5) {
                inputSix = randomNumbers;
                System.out.println("Number Six: " + inputSix);
            }

            if (i == 6) {
                inputSeven = randomNumbers;
                System.out.println("Number Seven: " + inputSeven);
            }

            if (i == 7) {
                inputEight = randomNumbers;
                System.out.println("Number Eight: " + inputEight);
            }

            if (i == 8) {
                inputNine = randomNumbers;
                System.out.println("Number Nine: " + inputNine);
            }

            if (i == 9) {
                inputTen = randomNumbers;
                System.out.println("Number Ten: " + inputTen);
            }


        }

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
