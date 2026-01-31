package devdojo.exfor;

/*
 * Leia 5 números e imprima o maior.
 */

public class For07 {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        for (int i = 0; i <= 4; i++) {
            int randomNums = (int) (Math.random() * 11);
            numbers[i] = randomNums;
        }


        if (numbers[0] > numbers[1] && numbers[0] > numbers[2] && numbers[0] > numbers[3] && numbers[0] > numbers[4]) {
            System.out.println(numbers[0] + " é o maior número!");
        } else if (numbers[1] > numbers[0] && numbers[1] > numbers[2] && numbers[1] > numbers[3] && numbers[1] > numbers[4]) {
            System.out.println(numbers[1] + " é o maior número!");
        } else if (numbers[2] > numbers[0] && numbers[2] > numbers[1] && numbers[2] > numbers[3] && numbers[2] > numbers[4]) {
            System.out.println(numbers[2] + " é o maior número!");
        } else if (numbers[3] > numbers[0] && numbers[3] > numbers[1] && numbers[3] > numbers[2] && numbers[3] > numbers[4]) {
            System.out.println(numbers[3] + " é o maior número");
        } else {
            System.out.println(numbers[4] + " é o maior número!");
        }

        for (int n: numbers) {
            System.out.println("Os números eram: " + n);
        }

    }

}



