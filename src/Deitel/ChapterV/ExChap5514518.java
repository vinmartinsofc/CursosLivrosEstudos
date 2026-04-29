package Deitel.ChapterV;

public class ExChap5514518 {
    public static void main(String[] args) {
//        double balance = 1000.0;
        int balance = 10000 / 10;
//        double rate = 0.05;
        int rate = 5;

        System.out.println("Debug " + balance);
        System.out.println("Debug " + rate);

        System.out.printf("%2s %20s", "Year", "Balance" );
        for (int year = 1; year <= 10; year++) {

            System.out.printf("%n%2d %,20d ", year, balance += balance * rate);
//            System.out.printf("%n%2d %,20d ", year, balance += balance * rate);

        }

    }
}
