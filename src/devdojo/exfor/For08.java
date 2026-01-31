package devdojo.exfor;

/*
 * Conte quantos números são positivos em uma sequência.
 */

public class For08 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {

            int randomGenerator = (int) (Math.random() * 100_000);

            if (randomGenerator % 2 == 0) {
                System.out.println("Par: " + randomGenerator);

            } else {
                System.out.println("Impar: " + randomGenerator);
            }

            System.out.println("Iteração número: " + i);

        }

    }
}