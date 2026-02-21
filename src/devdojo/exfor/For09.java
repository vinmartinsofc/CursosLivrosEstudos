package devdojo.exfor;

public class For09 {
    public static void main(String[] args) {

        int highestNumber = 0;

        for (int i = 0; i < 5; i++) {

            int randomGenerator = (int) (Math.random() * 101);
            System.out.println("Generated: " + randomGenerator);

            if (randomGenerator > highestNumber) {
                highestNumber = randomGenerator;
            }
        }

        System.out.println("Highest: " + highestNumber);



    }
}

