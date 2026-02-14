package devdojo.excontinue;

public class ExContinue01 {
    public static void main(String[] args) {
        int rand;
        int positivesCount = 0;

        for (int i = 0; i < 100; i++) {

            rand = (int) (Math.random() * 101) - 10;

            if (rand < 0) {
                continue;
            }

            positivesCount++;
        }

        System.out.println("Total Positives in 100 iterations: " + positivesCount);

    }
}
