package devdojo.exfor;

// Calcule o fatorial de um número.
public class For14 {

    public static void main(String[] args) {
        int rand = (int) (Math.random() * 31);
        int factorial = 0;
        int total = rand * rand;


        for (int i = rand; i != 0; i--) {

            if (rand > 0) {
                factorial = rand;
            }

            System.out.println(factorial+ " x " + i + " = " + factorial * i);
//            System.out.println(factorial * i);

        }

        System.out.println("Factorial de: " + factorial + " = " + total);

    }
}
