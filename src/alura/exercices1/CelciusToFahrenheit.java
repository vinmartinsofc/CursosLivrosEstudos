package alura.exercices1;

import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*

        (temperatura * 1.8) + 32.
         */

        System.out.println("Please, inform the temperature in celcius to be converted: ");

        double celciusTemperature = input.nextDouble();

        double converstion = (celciusTemperature * 1.8) + 32;

        System.out.println(celciusTemperature + " equals to " + converstion + " Fahrenheit.");

    }

}
