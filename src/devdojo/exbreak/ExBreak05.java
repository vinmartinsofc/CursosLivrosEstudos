package devdojo.exbreak;

public class ExBreak05 {
    public static void main(String[] args) {
        int rand;

        while  (true) {
            rand = (int) (Math.random() * 100_000) - 50_000;
            System.out.println("Not pair..." + rand);

            if (rand % 2 == 0) {
                System.out.println("Is pair....!");
                break;
            }

        }


    }
}
