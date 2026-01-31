package devdojo.exswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair");

        int opcaoDesejada = input.nextInt();

        switch (opcaoDesejada) {
            case 1:
                System.out.println("Carregando cadastro....");
                break;
            case 2:
                System.out.println("Carregando lista.......");
                break;
            case 3:
                System.out.println("Saindo....");
                break;
            default:
                System.out.println("Opção inválida!");

        }


    }
}
