package deitelHowToProgram10thEd;
//O resto da divisão por 10 é sempre o último dígito.

/*
(Separando os dígitos em um inteiro) Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário
digitar o número 42339, o programa deve imprimir

 */

import java.util.Scanner;

public class Ex12Dive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the five digits sequence");
        int inputNumber = scanner.nextInt();


        int n1 = (inputNumber / 10000) % 10;
        int n2 = (inputNumber / 1000) % 10;
        int n3 = (inputNumber / 100) % 10;
        int n4 = (inputNumber / 10) % 10;
        int n5 = inputNumber % 10;


//        int n1 = inputNumber % 10;
//        int n2 = (inputNumber / 10) % 10;
//        int n3 = (inputNumber / 100) % 10;
//        int n4 = (inputNumber / 1000) % 10;
//        int n5 = (inputNumber / 10000) % 10;


        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);


    }
}
