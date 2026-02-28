package devdojo.exwhile;

public class While04V2 {
    public static void main(String[] args) {

        int rand = 1;

        int count = 0;

        while (rand != 0) {

            rand = (int) (Math.random() * 21);
            count++;
            System.out.println(rand);

            if (count == 30) {
                System.out.println("We reached the limit!");
                break;
            }

        }

        System.out.println(count + " Numbers where generated.");


    }
}
