package devdojo.exdowhile;

public class DoWhile06 {
    public static void main(String[] args) {
        int rand;
        int count = 0;

        do {
            rand = (int) (Math.random() * 101);
            System.out.println("Numbers: " + rand);
            count++;
        } while (rand != 0);


        System.out.println("Total generated: " + count);

    }
}
