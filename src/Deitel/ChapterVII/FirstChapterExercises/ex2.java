package Deitel.ChapterVII.FirstChapterExercises;

public class ex2 {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;

        double[] fractions = new double[ARRAY_SIZE];

        System.out.println("4 element is " + fractions[4]);

        fractions[9] = 1.667;
        fractions[6] = 3.333;


        double sum = 0;

        for (int x = 0; x < fractions.length; x++) {
            sum += fractions[x];
        }

        System.out.println("Total: " + sum);
    }
}
