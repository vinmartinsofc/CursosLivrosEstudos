package devdojo.exarrays;

import java.util.Scanner;

public class arrays03 {
    public static void main(String[] args) {
        String[] musics = new String[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Adicione músicas a sua playlist: ");

        for (int i = 0; i < 5; i++) {
            musics[i] = input.nextLine();
        }

        for (String x :musics) {
            System.out.println("Você adicionou: " + x + " em sua playlist.");
        }


    }


}
