package devdojo.exdowhile;

public class DoWhile04 {
    public static void main(String[] args) {
        int rand;

        do {
            rand = (int) (Math.random() * 19);

            if (rand > 15 && rand != 18) {
                System.out.println("Under Ange: " + rand);
            }

        } while (rand != 18);

        System.out.println("You're an adult now! " + rand);

    }
}
