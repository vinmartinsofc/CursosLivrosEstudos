package devdojo.secondlayer;

public class Block01Ex05 {
    public static void main(String[] args) {

        int nums;
        int pairsCount = 0;

        for (int i = 0; i < 10; i++) {
            nums = (int) (Math.random() * 11);

            if (nums % 2 == 0) {
                pairsCount++;
            }

        }

        System.out.println("Total pairs: " + pairsCount);

    }
}
