package devdojo.exbreak;

public class ExBreak10 {
    public static void main(String[] args) {
        int rand;
        int count = 1;

        while (true) {

            rand = (int) (Math.random() * 99999);

            System.out.printf("Seaching item N°: %d %n", count);

            if (rand == 50) {
                System.out.println("Item found!");
                break;
            }
            count++;
        }
    }
}
