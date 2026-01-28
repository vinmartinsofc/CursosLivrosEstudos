package devdojo.exerciciosswitch;

//* Leia um código de produto e imprima sua categoria.

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Limpeza");
        System.out.println("2 - Eletrônicos");
        System.out.println("3 - Áudio & Vídeo");
        System.out.println("4 - Higiêne");

        String limpeza = "CIF Cremoso Laranja | CIF";
        String eletronicos = "Core™ i5-2400";
        String audioVideo = "Cabo Áudio 2 Rca X P10 Stereo Mxt 1,8MT";
        String higiene = "Desodorante Ban Stick 73g Shower Fresh";

        int code = input.nextInt();

        switch (code) {
            case 1:
                System.out.println("Imprimindo o produto: " + limpeza + ", da categoria: " + 1);
                break;
            case 2:
                System.out.println("Imprimindo o produto: " + eletronicos + ", da categoria: " + 2);
                break;
            case 3:
                System.out.println("Imprimindo o produto: " + audioVideo + ", da categoria: " + 3);
                break;
            case 4:
                System.out.println("Imprimindo o produto: " + higiene + ", da categoria: " + 4);
                break;
            default:
                System.out.println("Produto ou categoria inválidos.");
                break;
        }

    }
}
