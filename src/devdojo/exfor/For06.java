package devdojo.exfor;

import java.util.Arrays;

public class For06 {
    public static void main(String[] args) {
        double[] numbers = new double[6];

        for (int i = 0; i < 6; i++) {
            int randomNumbers = (int) (Math.random() * 1001);
            numbers[i] = randomNumbers;

        }

        for (double ns : numbers) {
            System.out.println("Lista de números do array: " + ns);
        }

        System.out.println("Maior número do array: " + Arrays.stream(numbers).max());



    }
}
