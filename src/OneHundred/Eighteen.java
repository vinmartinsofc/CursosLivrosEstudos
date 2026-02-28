package OneHundred;

import java.sql.SQLOutput;

public class Eighteen {
    public static void main(String[] args) {
        int rand = 0;
        int multiple = 0;

        for (int i = 0; i < 20; i ++) {
            rand = (int) (Math.random() * 101);

            if (rand % 3 == 0) {
                multiple++;
                System.out.println(rand);
            }

        }


        System.out.println("Total multiples of 3: " + multiple);

    }
}
