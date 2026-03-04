package devdojo.secondlayer;

public class Block02Ex01 {
    public static void main(String[] args) {
        int rand;
        int oddCount = 0;

        for (int i = 0; i < 100; i++) {
            rand = (int) (Math.random() * 151);

            System.out.println("debug: " + rand);
            if (oddCount == 0) {
                oddCount = rand;
                continue;
            }

            if (rand % 2 != 0 && rand < oddCount) {
                oddCount = rand;
            }

        }


        System.out.println("Lowest odd: " + oddCount);


    }
}
