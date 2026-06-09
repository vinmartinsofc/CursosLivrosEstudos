package Tests;

public class Test2 {
    public static void main(String[] args) {
        double[] c = new double[100];

        for (int i = 0; i < c.length; i++) {
            c[i] += i ;

        }

        for (double runIt : c) {
            System.out.println(runIt);
        }

    }
}
