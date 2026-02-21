package devdojo.exdebug;

public class ExDebug03 {
    public static void main(String[] args) {
        int rand;

        for (int i = 0; i < 21; i++) {

            rand = (int) (Math.random() * 11);

            if (rand > 5) {
                System.out.println("Do this!");
            } else {
                System.out.println("Do that");
            }


            if (rand == 7) {
                System.out.println("Lucky Number!");
            }

        }

        System.out.println("We got to the end");
        

    }
}
