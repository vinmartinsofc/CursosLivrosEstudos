package devdojo.exbreak;

public class ExBreak08 {
    public static void main(String[] args) {
        int rand;
        int count = 0;

        for (int i = 0; i < 100; i++) {

            rand = (int) (Math.random() * 101) - 10;

            System.out.printf("Debug: %d %n", rand);

            if (rand <0 ) {
                break;

            }
            count++;
        }

        System.out.printf("Debug 2: %d", count);
    }
}
