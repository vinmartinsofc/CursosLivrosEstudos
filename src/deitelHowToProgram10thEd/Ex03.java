package deitelHowToProgram10thEd;
/*
(Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto,
diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.
 */

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int integerNumberOne;
        int integerNumberTwo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer ");
        integerNumberOne = scanner.nextInt();

        System.out.println("Enter the scond integer");
        integerNumberTwo = scanner.nextInt();

        int prod = integerNumberOne * integerNumberTwo;
        System.out.println("Produto: " + prod);

        int difference = integerNumberOne - integerNumberTwo;
        System.out.println("Difference: " + difference);

        int quotient = 0;

        if (integerNumberTwo != 0 ) {
            quotient = integerNumberOne / integerNumberTwo;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed");
        }

        scanner.close();

    }
}
