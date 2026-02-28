package devdojo.excondicionais;

public class Condicionais03AndNumberGenerator {
    public static void main(String[] args) {
        int numberOne, numberTwo, numberThree;


        for (int i = 0; true; i++) {
            numberOne = (int) (Math.random() * 10);
            if (i == 0) {
                break;
            }
        }

        for (int i = 0; true; i++) {
            numberTwo = (int) (Math.random() * 10);

            if (i == 0) {
                break;
            }
        }

        for (int i = 0; true; i++) {
            numberThree = (int) (Math.random() * 10);

            if (i == 0) {
                break;
            }
        }

        System.out.println("Primeiro número: " + numberOne);
        System.out.println("Segundo número: " + numberTwo);
        System.out.println("Terceito número: " + numberThree);

        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println(numberOne + " O maior!");
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println(numberTwo + " O maior!");
        } else if (numberThree > numberOne && numberThree > numberTwo) {
            System.out.println(numberThree + " O maior!");
        } else {
            System.out.println("Os maiores são iguais!");
        }
    }

}
