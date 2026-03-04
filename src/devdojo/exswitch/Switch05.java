package devdojo.exswitch;

import java.util.Scanner;

public class Switch05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Divisão");
        System.out.println("2 - Multiplicação");
        System.out.println("3 - Adição");
        System.out.println("4 - Subtração");

        int userInput = input.nextInt();

        switch (userInput) {
            case 1: {
                System.out.println("Informe os números: ");
                double n1 = input.nextDouble();
                double n2 = input.nextDouble();
                input.nextLine();
                System.out.printf("Resultado: %.2f ", n1 / n2);
            }
            break;
            case 2: {
                System.out.println("Informe os números: ");
                double n1 = input.nextDouble();
                double n2 = input.nextDouble();
                input.nextLine();
                System.out.printf("Resultado: %.2f ", n1 * n2);
            }
            break;
            case 3: {
                System.out.println("Informe os números: ");
                double n1 = input.nextDouble();
                double n2 = input.nextDouble();
                input.nextLine();
                System.out.printf("Resultado: %.2f ", n1 + n2);
            }
            break;
            case 4: {
                System.out.println("Informe os números: ");
                double n1 = input.nextDouble();
                double n2 = input.nextDouble();
                input.nextLine();
                System.out.printf("Resultado: %.2f ", n1 - n2);
            }
            default:
                System.out.println("Opção inválida.");
        }


    }
}
