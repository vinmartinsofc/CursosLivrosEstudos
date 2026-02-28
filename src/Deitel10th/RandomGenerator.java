package Deitel10th;

public class RandomGenerator {
    public static void main(String[] args) {
        int rand;
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;

        for (int i = 0; i < 5; i++) {
            rand = (int) (Math.random() * 101);

            if (n1 == 0) {
                n1 = rand;
                continue;
            } else if (n2 == 0) {
                n2 = rand;
                continue;
            } else if (n3 == 0) {
                n3 = rand;
                continue;
            } else if (n4 == 0) {
                n4 = rand;
                continue;
            } else {
                n5 = rand;
                continue;
            }

        }


        System.out.println("N1: " + n1);
        System.out.println("N2: " + n2);
        System.out.println("N3: " + n3);
        System.out.println("N4: " + n4);
        System.out.println("N5: " + n5);

    }
}
