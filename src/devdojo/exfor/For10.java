package devdojo.exfor;

public class For10 {
    public static void main(String[] args) {

        int lowest = 100;


        for (int i = 1; i < 6; i++) {

            int rand = (int) (Math.random() * 101);
            System.out.println("Generated number: " + rand);

            if (rand < lowest) {
                lowest = rand;
            }

        }

        System.out.println("Lowest Number: " + lowest);

    }
}
