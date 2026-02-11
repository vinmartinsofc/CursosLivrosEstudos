package devdojo.exbreak;

public class ExBreak02 {
    public static void main(String[] args) {

        int rand;
        int count = 1;

        do {
            rand = (int) (Math.random() * 999) - 50;
            System.out.println("Counting......" + count);
            if (rand == -1) {
                System.out.println("Break condition reached!");
                break;
            }

            count++;
        } while (true);

    }
}

