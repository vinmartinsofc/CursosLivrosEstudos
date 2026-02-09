package devdojo.exwhile;

public class While10 {
    public static void main(String[] args) {
        int count = 0;
        int pairs = 0;


        while (true) {

            int rand = (int) (Math.random() * 999);

            if (rand % 2 == 0) {
                pairs++;

            }

            count++;

            if (count == 30) {
                break;
            }

        }

        System.out.println("Total pairs: " + pairs);
        System.out.println("Total generated numbers: " + count);


    }


}

