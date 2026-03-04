package devdojo.exswitch;

import java.util.Scanner;

public class Switch09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dayOfTheWeek = ((int) (Math.random() * 7));

        switch (dayOfTheWeek) {
            case 0:
                System.out.println("Domingo.");
                break;
            case 1:
                System.out.println("Segunda-Feira.");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira.");
                break;
            case 4:
                System.out.println("Quinta-Feira.");
                break;
            case 5:
                System.out.println("Sexta-Feira.");
                break;
            case 6:
                System.out.println("Sábado.");
                break;
            default:
                System.out.println("Dia incorreto.");
        }


        /*s

        if (dayOfTheWeek.equalsIgnoreCase("segunda")) {
            System.out.println("Segunda-Feira.");
        } else if (dayOfTheWeek.equalsIgnoreCase("terca") || dayOfTheWeek.equalsIgnoreCase("terça")) {
            System.out.println("Terça-Feira.");
        } else if (dayOfTheWeek.equalsIgnoreCase("quarta")) {
            System.out.println("Quarta-Feira.");
        } else if (dayOfTheWeek.equalsIgnoreCase("quinta")) {
            System.out.println("Quinta-Feira.");
        } else if (dayOfTheWeek.equalsIgnoreCase("sexta")) {
            System.out.println("Sexta-Feira.");
        } else if (dayOfTheWeek.equalsIgnoreCase("sabado") || dayOfTheWeek.equalsIgnoreCase("sábado")){
            System.out.println("Sábado (Final de semana)");
        } else if (dayOfTheWeek.equalsIgnoreCase("domingo")) {
            System.out.println("Domingo (Final de semana.)");
        }
*/

    }
}
