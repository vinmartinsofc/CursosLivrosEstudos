package deitelHowToProgram10thEd;

/*
(Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro
no grupo. Utilize somente as técnicas de programação que você aprendeu neste capítulo.
 */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Integer: ");
        int n1 = scanner.nextInt();

        System.out.println("Second Integer: ");
        int n2 = scanner.nextInt();

        System.out.println("Third Integer: ");
        int n3 = scanner.nextInt();

        System.out.println("Fourth Integer: ");
        int n4 = scanner.nextInt();

        System.out.println("Five Integer: ");
        int n5 = scanner.nextInt();

        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5 ) {
            System.out.println("First: " + n1 + " highest");
        } else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
            System.out.println("Second: " + n2 + " hiest");
        } else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
            System.out.println("Third: " + n3 + " highest");
        } else if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5 ) {
            System.out.println("Fourth: " + n4 + " highest");
        } else {
            System.out.println("Five: " + n5 + " highest");
        }


        if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5 ) {
            System.out.println("First: " + n1 + " lowest");
        } else if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5) {
            System.out.println("Second: " + n2 + " lowest");
        } else if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5) {
            System.out.println("Third: " + n3 + " lowest");
        } else if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5 ) {
            System.out.println("Fourth: " + n4 + " lowest");
        } else {
            System.out.println("Five: " + n5 + " lowest");
        }

        


    }
}
