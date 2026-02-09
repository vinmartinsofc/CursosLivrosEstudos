package deitelHowToProgram10thEd;

/*
(Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número
maior seguido pelas palavras “is larger". Se os números forem iguais, imprima a mensagem “These numbers are equal". Utilize
as técnicas mostradas na Figura 2.15.
 */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;


        System.out.println("First Integer: ");
        n1 = scanner.nextInt();

        System.out.println("Second Integer: ");
        n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("First: "+ " '" + n1 + "' " +  " is larger");
        } else if (n1 == n2) {
            System.out.println("These numbers are equal");
        } else {
            System.out.println("Second: "+ " '" + n2 + "' " +  " is larger");
        }

    


    }
}
