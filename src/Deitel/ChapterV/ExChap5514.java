package Deitel.ChapterV;

public class ExChap5514 {
    public static void main(String[] args) {
        double balance = 1000.0;
        double rate = 0.05;

        System.out.printf("%4s %10s", "Year", "Balance");
        for (int i = 1; i <= 10; i++) {

            balance += balance * rate;
            System.out.printf("%n%4d %,10.2f", i, balance);
        }

    }
}
