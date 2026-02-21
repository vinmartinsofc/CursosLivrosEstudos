package devdojo.exbreak;

public class ExBreak01 {
    public static void main(String[] args) {

        int rand;
        int iterCount = 1;

        while (true) {

            rand = (int) (Math.random() * 999);

            if (rand == 5) {
                break;
            }

            System.out.printf("Iteration Nº: %d %n ", iterCount);
            iterCount++;
        }

        System.out.println("Limit reached!");

    }
}
