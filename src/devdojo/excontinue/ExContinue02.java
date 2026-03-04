package devdojo.excontinue;

public class ExContinue02 {
    public static void main(String[] args) {
        int rand;


        for (int i = 0; i < 100; i++) {
            rand = (int) (Math.random() * 11) ;

            if (rand % 2 > 0) {
                continue;
            }

            System.out.println("Pairs: " + rand);

        }


    }
}
