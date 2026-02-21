package devdojo.exdebug;

public class ExDebug02 {
    public static void main(String[] args) {
        int rand;
        for (int i = 0; i < 100; i ++) {

             rand = (int) (Math.random() * 999);

            System.out.println("Value of rand: " + rand);

        }


        System.out.println("Bye!");

    }
}
