package OneHundred;

public class TwentyWithRandom {
    public static void main(String[] args) {
        int rand = 1;
        int previous = 0;

        while (rand != 0) {
            rand = (int) (Math.random() * 101);

            if (previous == 0) {
                previous = rand;
                continue;
            }

            if (rand < previous && rand != 0) {
                previous = rand;
            }

            System.out.println("Generated: " + rand);


        }


        System.out.printf("%nLowest Number is: %d", previous);

    }
}
