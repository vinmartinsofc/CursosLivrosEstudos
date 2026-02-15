package devdojo.exdebug;

public class ExDebug05 {
    public static void main(String[] args) {
        int random;

        for (int i = 0; i < 10; i++) {
            random = (int) (Math.random() * 11);

            if (random < 8) {
                continue;
            }

            System.out.println("Generated: " + random);

        }

    }
}
