package devdojo.exbreak;

public class ExBreak09 {
    public static void main(String[] args) {
        int rand;

        while (true) {

            rand = (int) (Math.random() * 999);

            System.out.println("Debug: " + rand);

            if (rand % 2 == 0) {
                break;
            }

        }

    }
}
