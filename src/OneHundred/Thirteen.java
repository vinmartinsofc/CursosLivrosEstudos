package OneHundred;

public class Thirteen {
    public static void main(String[] args) {
        int rand;
        int totalSum = 0;
        int numCount = 0;

        for (int i = 0; i < 10; i++) {
            rand = (int) (Math.random() * 999);
            System.out.println("Num: " + rand + " added to the total");
            totalSum += rand;
            numCount++;
        }

        System.out.printf("%nNumCount debug: %d%n", numCount);
        System.out.printf("The total is: %d%n", totalSum);

    }
}
