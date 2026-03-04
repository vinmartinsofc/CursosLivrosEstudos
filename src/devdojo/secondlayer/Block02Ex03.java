package devdojo.secondlayer;

public class Block02Ex03 {
    public static void main(String[] args) {
        int rand = 0;
        int temp = 0;

        for (int i = 0; i < 10; i++) {

            rand = (int) (Math.random() * 21);

            if (temp == 0) {
                temp = rand;
                continue;
            }

            if (rand < temp) {
                temp = rand;
            }

            if (temp == 0) {
                System.out.println("Any match");
            }

        }

        System.out.println("Lowest Number: " + temp);
    }
}
