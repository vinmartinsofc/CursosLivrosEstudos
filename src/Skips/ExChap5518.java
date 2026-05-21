package Skips;

//Skipped

public class ExChap5518 {
    public static void main(String[] args) {
        int amount;
        int principal = 1000;
        int rate = 5 / 100;

        System.out.printf("%s%20s %n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++) {

            amount = (int) (principal * Math.pow(1.0 + rate, year));

            System.out.printf("%4d%,20d%n", year, amount);


        }
    }
}
