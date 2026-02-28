package devdojo.exfor;

public class For10Inverse {
    public static void main(String[] args) {

        int higher = 0;

        for (int i = 1; i < 6; i++) {

            int rand = (int) (Math.random() * 99);

            System.out.println("Generated numbers: " + rand);

            if (rand > higher) {
                higher = rand;
            }

        }

        System.out.println("Higher number: " + higher);


    }
}
