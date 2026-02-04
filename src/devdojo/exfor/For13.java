package devdojo.exfor;

// Imprima os números de 1 a 100 pulando de 5 em 5.

public class For13 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0) {
                System.out.println(i);
            }

        }
    }
}
