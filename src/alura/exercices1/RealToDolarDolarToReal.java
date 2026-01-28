package alura.exercices1;

import java.util.Scanner;

public class RealToDolarDolarToReal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double dolarValue = 5.37;

        System.out.println("Please, inform the amount of money in real: ");

        double realValue = input.nextDouble();

        double convertion = realValue / dolarValue;

        String msg = String.format("%.2f Real equals to %.2f dollars.", realValue,  convertion);

        String anualIncome = String.format("Your anual income is: %.2f", convertion * 12);

        System.out.println(msg);

        System.out.println(anualIncome);








    }
}
