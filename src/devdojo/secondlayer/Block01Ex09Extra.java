package devdojo.secondlayer;

public class Block01Ex09Extra {
    public static void main(String[] args) {
        int rand;
        int greatestPair = 0;

        for (int i = 0; i < 5; i++) {
            rand = (int) (Math.random() * 101);

            if (rand % 2 == 0 && rand > greatestPair) {
                greatestPair = rand;

            }

        }

        if (greatestPair != 0 ) {
            System.out.println("Greates pair: " + greatestPair);

        } else {
            System.out.println("Any pair detected.");
        }


    }

}
