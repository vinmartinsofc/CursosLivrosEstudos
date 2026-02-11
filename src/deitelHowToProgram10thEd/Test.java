package deitelHowToProgram10thEd;

public class Test {
    public static void main(String[] args) {
        double n1 = 0, n2 = 0, n3 = 0;
        double rand;
        for (int i = 0; i < 3; i++) {
            rand = Math.random() * 101;

            if (i == 0) {
                n1 = rand;
            } else if (i == 1) {
                n2 = rand;
            } else {
                n3 = rand;
            }

        }

        System.out.printf("1 = %-13.2f 2 = %-13.2f 3 = %-13.2f %n", n1, n2, n3);

    }
}
