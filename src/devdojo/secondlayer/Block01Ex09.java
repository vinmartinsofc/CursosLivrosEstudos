package devdojo.secondlayer;

public class Block01Ex09 {
    public static void main(String[] args) {
        int randomNumber;
        int previewsNumber = 0;
        int greatest = 0;

        for (int i = 0; i < 10; i++) {

            randomNumber = (int) (Math.random() * 101);

            if (randomNumber % 2 == 0 && previewsNumber == 0) {
                previewsNumber = randomNumber;
                greatest = randomNumber;
                continue;
            }

            if (randomNumber > previewsNumber && randomNumber % 2 == 0) {
                previewsNumber = randomNumber;
                greatest = randomNumber;
            }


        }

        System.out.println("Greatest Pair: " + greatest);

    }
}
