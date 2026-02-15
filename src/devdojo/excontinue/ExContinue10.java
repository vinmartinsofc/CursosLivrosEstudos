package devdojo.excontinue;

public class ExContinue10 {
    public static void main(String[] args) {
        int rand;
        int iter = 100;

        while  (iter != 0) {
            iter--;

            rand = (int) (Math.random() * 100);

            if (rand < 50) {
                continue;
            }

            System.out.println(rand);

        }

    }
}
