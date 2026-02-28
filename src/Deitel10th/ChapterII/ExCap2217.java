package Deitel10th.ChapterII;

/*
(Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média neste exercício deve resultar
em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]
 */

public class ExCap2217 {
    public static void main(String[] args) {
        int rand;
        int n1 = 0, n2=0, n3=0;
        int sum = 0;
        int avg = 0;
        int product = 0;

        for (int i = 0; i < 3; i++) {
            rand = (int) (Math.random() * 11);

            if (n1 == 0) {
                n1 = rand;
                continue;
            } else if (n2 == 0) {
                n2 = rand;
                continue;
            } else {
                n3 = rand;
                continue;
            }
        }

        System.out.print("Debug 1: " + n1);
        System.out.print(", Debug 2: " + n2);
        System.out.print(", Debug 3: " + n3 + "\n");

            sum = n1 + n2 + n3;
            avg = (n1 + n2 + n3) / 3;
            product = n1 * n2 * n3;

            System.out.println("Sum: " + sum);
            System.out.println("Avg: " + avg);
            System.out.println("Product: " + product);

            if (n1 > n2 && n1 > n3) {
                System.out.println("N1: " + n1 + " highest.");
            } else if (n2 > n1 && n2 > n3) {
                System.out.println("N2: " + n2 + " highest.");
            } else {
                System.out.println("N3: " + n3 + " highest.");

            }

        }

}
