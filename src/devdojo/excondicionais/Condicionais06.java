package devdojo.excondicionais;

import java.util.Scanner;

//* Leia um ano e informe se é bissexto.
public class Condicionais06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Os últimos 6 anos tiveram: ");
        System.out.println("2025 = 365 dias!");
        System.out.println("2024 = 366 dias!");
        System.out.println("2023 = 365 dias!");
        System.out.println("2022 = 365 dias!");
        System.out.println("2021 = 365 dias!");
        System.out.println("2020 = 366 dias!");
        System.out.println("Para saber se o ano é ou não bisexto, informe a quantidade de dias do mesmo: ");
        int ano = input.nextInt();

        boolean isBisexto = ano == 366;

        if (!isBisexto) {
            System.out.println("O ano não é bisexto: " + ano + " dias.");
        } else {
            System.out.println("O ano é bisexto: " + ano + " dias.");
        }


    }
}
