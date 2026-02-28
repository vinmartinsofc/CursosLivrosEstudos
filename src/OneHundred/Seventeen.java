package OneHundred;

public class Seventeen {
    public static void main(String[] args) {
        int rand;
        int between = 0;

        for (int i = 0; i < 10; i++) {
            rand = (int) (Math.random() * 51);

            if (rand > 9 && rand < 21) {
                between++;
                System.out.println("Between 10 and  20: " + rand);
            }

        }

        System.out.printf("%nTotal Numbers between 10 and 20: %d%n", between);
    }
}
