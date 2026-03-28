package Deitel.ChapterIV;

import java.util.Scanner;

public class ExCap4417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int killometers;
        int fuel = 0;
        int killometersSum = 0;
        int fuelSum = 0;
        int trips = 0;
        double avgFuelPerLitter = 0;

        System.out.print("Enter the amount of kilometer ridden -1 to quit: ");
        killometers = scanner.nextInt();

        while (killometers != -1) {

            System.out.print("Enter the amount of fuel consumed: ");
            fuel = scanner.nextInt();

            killometersSum += killometers;
            fuelSum += fuel;
            trips++;

            System.out.printf("%d kilometers ridden with %d fuel does %.2f killometers per litter %n",
                        killometers, fuel, (double) killometers / fuel);

            System.out.print("Enter the amount of kilometer ridden -1 to quit: ");
            killometers = scanner.nextInt();
        }
        if (trips > 0) {
            if (fuelSum > 0) {
                avgFuelPerLitter = (double) killometersSum / fuelSum;
            }
            System.out.println("Total trips: " + trips);
            System.out.printf("Average km per liter : %.2f%n", avgFuelPerLitter);
            System.out.printf("Total kilometers rode: %d%n", killometersSum);
            System.out.printf("Total fuel used: %d%n", fuelSum);
        } else {
            System.out.println("Application closed by user");
        }

        scanner.close();
    }

}
