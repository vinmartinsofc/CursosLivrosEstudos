package devdojo.excontinue;

public class ExContinue09 {
    public static void main(String[] args) {
        double rand = 0;
        boolean isFifth = false;
        int count = 0;
        int validNotes = 0 ;
        int invalidNotes = 0 ;

        for (int i = 0; i <= 51; i++) {
            count++;

            rand = Math.random() * 11;

            if (rand < 6.0) {
                invalidNotes++;
                System.out.printf("Invalid note ignored: %.2f %n", rand);
                continue;
            }

            validNotes++;

            System.out.printf("Generated: %.2f %n", rand);


            if (count == 50) {
                isFifth = true;
            }

        }

        System.out.println(isFifth);
        System.out.println("Total invalid Notes: " + invalidNotes);
        System.out.println("Total valid Notes: " + validNotes);

    }
}




