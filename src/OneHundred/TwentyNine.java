package OneHundred;

public class TwentyNine {
    public static void main(String[] args) {
        int rand;
        int greatest = 0;
        int lowest = 0;

        for (int i = 0; i < 6; i++) {

            rand = (int) (Math.random() * 101);

            if (greatest == 0 && lowest == 0) {
                lowest = rand;
                greatest = rand;
                continue;
            }

            if (rand > greatest) {
                greatest = rand;
            }

            if (rand < lowest) {
                lowest = rand;
            }

        }

        System.out.println("Greatest: " + greatest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Difference: " + (greatest - lowest));


    }
}
