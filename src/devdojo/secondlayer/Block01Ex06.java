package devdojo.secondlayer;

public class Block01Ex06 {
    public static void main(String[] args) {
        int nums;
        int notPair = 0;

        for (int i = 0; i < 5; i++) {
            nums = (int) (Math.random() * 11);

            if (nums % 2 != 0) {
                notPair++;
            }

        }

        System.out.println("Total not pairs: " + notPair);

    }
}
