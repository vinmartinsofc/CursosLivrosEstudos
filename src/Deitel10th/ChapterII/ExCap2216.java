package Deitel10th.ChapterII;

/*
(Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número
maior seguido pelas palavras “is larger". Se os números forem iguais, imprima a mensagem “These numbers are equal". Utilize
as técnicas mostradas na Figura 2.15.
 */

import java.util.Scanner;

public class ExCap2216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer ");
        int  first = input.nextInt();

        System.out.print("Enter second integer ");
        int  second = input.nextInt();

        if (first > second) {
            System.out.println(first + " Is larger than " + second);
        } else if (second > first){
            System.out.println(second + " Is larger than " + first);
        } else {
            System.out.println("These numbers are equal");
        }

    }
}
