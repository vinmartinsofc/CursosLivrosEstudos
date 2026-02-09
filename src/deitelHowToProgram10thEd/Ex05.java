package deitelHowToProgram10thEd;
/*
(Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média neste exercício deve resultar
em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("First: ");
        n1 = scanner.nextInt();

        System.out.println("Second: ");
        n2 = scanner.nextInt();

        System.out.println("Third one: ");
        n3 = scanner.nextInt();


        int sum = n1 + n2 + n3;

        int avg = (n1 + n2 + n3) / 3;

        int product = n1 * n2 * n3;


        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
        System.out.println("Product: " + product);


        if (n1 > n2 && n1 > n3) {
            System.out.println("First:" + n1 + " highest one.");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("Second:" + n2 + " highest one.");
        } else {
            System.out.println("Third: " + n3 + " highest one.");
        }

        if (n1 < n2 && n1 < n3) {
            System.out.println("First:" + n1 + " the lowest one");
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("Second:" + n2 + " the lowest one");

        } else {
            System.out.println("Third:" + n3 + " the lowest one");
        }


    }
}
