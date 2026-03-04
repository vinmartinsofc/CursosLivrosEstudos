package devdojo.secondlayer;

public class Block01Ex01 {
    public static void main(String[] args) {
        int rand;
        int previewNumber = 0;

        for (int i = 0; i < 5; i++) {

            rand = (int) (Math.random() * 51);
            System.out.println("Generated: " + rand);

            if (previewNumber == 0) {
                previewNumber = rand;
                continue;
            }

            if (rand > previewNumber) {
                previewNumber = rand;
            }

        }

        System.out.println("Highest: " + previewNumber);

    }
}
