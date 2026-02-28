package OneHundred;

public class Nineteen {
    public static void main(String[] args) {
        int rand;
        int lastNum = 0;

        for (int i = 0; i < 10; i++) {
            rand = (int) (Math.random() * 1001);

            if (rand > lastNum) {
                lastNum = rand;
                System.out.println("Greatest so far: " + lastNum);
            }

        }

        System.out.println("Greates of all: " + lastNum);

    }
}
