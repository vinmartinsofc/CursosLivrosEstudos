package devdojo.secondlayer;

public class Block02Ex02 {
    public static void main(String[] args) {
        int rand;
        int temp = 0;


        for (int i = 0; i < 10; i++) {
            rand = (int) (Math.random() * 11);
            
            if (rand > temp) {
                temp = rand;
            }

            System.out.println("Debug: " + rand);

        }

        System.out.println("Greates of ten: " + temp);

    }
}
