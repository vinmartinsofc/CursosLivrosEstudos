package Deitel10th.ChapterIV;

import java.util.Scanner;

public class ExCap4417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalKillometers = 0;
        int totalFuel = 0;
        int killometers = 0;
        int fuel = 0;
        double killometerPerLiter = 0;
        double average = 0;
        int tripCount = 0;

        System.out.print("Enter the amount of kilometer ridden or press -1 to exit: ");
        killometers = scanner.nextInt();

        System.out.print("Enter the amount of fuel consumed or press -1 to exit: ");
        fuel = scanner.nextInt();

        System.out.printf("%d killometers with %d of fuel does %.2f killometer per liter %n",
                killometers, fuel, killometerPerLiter);

        while (killometers != -1) {
            System.out.print("Enter the amount of kilometer rode or press -1 to exit: ");
            killometers = scanner.nextInt();

            System.out.print("Enter the amount of fuel consumed or press -1 to exit: ");
            fuel = scanner.nextInt();

            if (fuel <= 0) {
                System.out.println("Can't divide by zero");
                continue;
            }

            totalKillometers += killometers;
            totalFuel += fuel;

            killometerPerLiter = (double) killometers / fuel;

            System.out.printf("%d killometers with %d of fuel does %.2f killometer per liter %n",
                    killometers, fuel, killometerPerLiter);

            tripCount++;

        }

        System.out.printf("Total kilometers rode: %d%n", totalKillometers);
        System.out.printf("Total fuel used: %d%n", totalFuel);

        if (totalFuel > 0) {
             average = (double) totalKillometers / totalFuel;
            System.out.printf("Average km per liter overall: %.2f%n", average);
        }

        System.out.println("Trips: " + tripCount);

        scanner.close();
    }

}
