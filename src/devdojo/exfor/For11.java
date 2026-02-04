package devdojo.exfor;
//* Conte quantos números são positivos em uma sequência.

public class For11 {
    public static void main(String[] args) {

        int positiveCount = 0;
        int negativeCount = 0;
        int count = 1;

        for (int a = 1; a <= 5; a++) {

            int rander = ((int) (Math.random() * 100) - 50);

            if (rander >= 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }

            System.out.println("Numbers: " + rander);
            System.out.println("Positives: " + positiveCount);
            System.out.println("Negatives: " + negativeCount);
            System.out.println("How many numbers where generated? " + count);


            count++;
        }

    }
}
