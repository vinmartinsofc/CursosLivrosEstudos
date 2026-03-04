package devdojo.excontinue;

public class ExContinue04 {
    public static void main(String[] args) {
        int rand;
        int invalidCount = 0;
        int validCount = 0;

        for (int i = 0; i < 100; i++) {
            rand = (int) (Math.random() * 50001) - 2500;

            if (rand < 0) {
                invalidCount++;
                continue;
            }

            validCount++;
        }

        System.out.println("Total valid nums: " + validCount);
        System.out.println("Total invalid nums: " + invalidCount);


    }
}
