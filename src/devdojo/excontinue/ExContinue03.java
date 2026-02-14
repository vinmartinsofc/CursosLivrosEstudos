package devdojo.excontinue;

public class ExContinue03 {
    public static void main(String[] args) {
        int rand;

        for (int i = 0; i < 100; i++) {

            rand = (int) (Math.random() * 11);

            if (rand % 3 == 0) {

                continue;
            }


            System.out.println("Não multiplica por 3: " + rand);

        }

    }
}
