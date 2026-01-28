package devdojo.exerciciosswitch;

//* Leia uma operação (+ - \* /) e dois números, calcule o resultado.

import java.util.Scanner;

public class Switch05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = input.nextInt();

        if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
            System.out.println("Opção Inválida");
        } else if (opcao == 1) {
            System.out.println("Você escolheu a opção " + opcao + ": Adição");
            System.out.println("Informe os números a serem calculados separados por espaços, ou um após o outro");
            double n1 = input.nextInt();
            double n2 = input.nextInt();
            double resultado = n1 + n2;
            System.out.println("O resultado de " + n1 + " + " + n2 + " é: " + resultado);

        } else if (opcao == 2) {
            System.out.println("Você escolheu a opção " + opcao + ": Subtração");
            System.out.println("Informe os números a serem calculados separados por espaços, ou um após o outro");
            double n1 = input.nextInt();
            double n2 = input.nextInt();
            double resultado = 0D;

            if (n1 > n2) {
                double updatedValue = n1;
                resultado = updatedValue - n2;
                System.out.println("O resultado de " + n2 + " - " + n1 + " é: " + resultado);
            } else {
                resultado = n1 - n2;
                System.out.println("O resultado de " + n1 + " - " + n2 + " é: " + resultado);
            }


        } else if (opcao == 3) {
            System.out.println("Você escolheu a opção " + opcao + " Multiplicação");
        } else {
            System.out.println("Você escolheu a opção " + opcao + " Divisão");
        }


    }
}
