package devdojo.exfor;

/*
 * Conte quantos números são positivos em uma sequência.
 */

public class For08 {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {

            int randomGenerator = (int) (Math.random() * 50) - 10;

            if (randomGenerator < 0) {
                System.out.println("Negativo: " + randomGenerator);
            } else {
                System.out.println("Positivo: " + randomGenerator );
            }
        }

    }
}