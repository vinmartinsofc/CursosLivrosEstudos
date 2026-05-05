package CodeCalisthenics;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        int dayCount = 1;
        double dailyAvg;
        double highest = Integer.MIN_VALUE;
        double lowest = Integer.MAX_VALUE;
        int opt = 0;


        while (opt != 2) {

            for (int i = 0; i < 30; i++) {
                System.out.print("What's the daily sell R$: ");
                double dailySell = scanner.nextDouble();

                if (dailySell > highest) {
                    highest = dailySell;
                }

                if (dailySell < lowest && dailySell < highest) {
                    lowest = dailySell;
                }

                total += dailySell;
                dailyAvg = total / dailySell;

                if (dayCount == 30) {
                    System.out.printf("%nTotal: %.2f%n" +
                            "Daily Avg:%.2f%n" +
                            "Highest day sale:%.2f%n" +
                            "Lowest day sale:%.2f%n", total, dailyAvg, highest, lowest);
                }


                dayCount++;
            }

            System.out.print("Would you like to do another month analyse: (1-yes/2-no)");
            opt = scanner.nextInt();


        }


    }
}
