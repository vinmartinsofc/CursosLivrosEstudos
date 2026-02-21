package devdojo.secondlayer;

public class Block01Ex08 {
    public static void main(String[] args) {
        int rand;
        int lowerThanThird = 0;

        for (int i = 0; i < 5; i++) {
            rand = (int) (Math.random() * 71);

            if (rand < 30) {

                lowerThanThird++;
            }

        }
        System.out.println("Total greater than fifth: " + lowerThanThird);

    }
}
