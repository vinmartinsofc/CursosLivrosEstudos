package Deitel10th.ChapterIV.SolvingTheSentinelProblem;

public class Sentinel03 {
    public static void main(String[] args) {
        int rand = 0;
        int total = 0;
        int count = 0;

        while (rand != -1) {
            rand = (int) (Math.random() * 101) - 10;

            if (rand > 0) {
                total += rand;
            }
            count++;

        }
        if (total > 0) {
            System.out.println("Avg of numbers is: " + (total / count));
        } else {
            System.out.println("No positive number generated");
        }

    }
}
