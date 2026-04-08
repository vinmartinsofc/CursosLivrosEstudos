package Algorithms;

public class CH1 {
    public static void main(String[] args) {
        int num = 5;
        int guess = 0;
        int count = 0;
        int count2 = 0;
        int avgGuess = 0;
        int total = 0;

        while (count < 10) {

            while (count < 10) {
                guess = (int) (Math.random() * 6);


                System.out.println("Guesses: " + count2);
                count++;
            }


            avgGuess += count;
            count++;
        }




//        if (count > 0) {
//           double calc = avgGuess / total;
//            System.out.printf("Avg: %.2f", calc);
//
//        } else {
//            System.out.println("...");
//        }


    }
}
