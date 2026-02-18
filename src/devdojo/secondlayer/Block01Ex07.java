package devdojo.secondlayer;

public class Block01Ex07 {
    public static void main(String[] args) {
        int rand;
        int greaterThanFifth = 0;

        for (int i = 0; i < 5; i++) {
            rand = (int) (Math.random() * 71);

            if (rand > 50) {

                greaterThanFifth++;
            }

        }

        System.out.println("Total greater than fifth: " + greaterThanFifth);

    }
}
