package OneHundred;

public class Thirty {
    public static void main(String[] args) {
        int rand;
        int greatest = 0;
        int secondGreatest = 0;

        for (int i = 0; i < 6; i++) {
            rand = (int) (Math.random() * 101);
            System.out.println("Numbers: " + rand);

            if (rand > greatest) {
                greatest = rand;
            }

            if (rand > secondGreatest && rand < greatest) {
                secondGreatest = rand;
            }

        }


        System.out.println("Greatest: " + greatest);
        System.out.println("Second Greatest: " + secondGreatest);

    }
}
