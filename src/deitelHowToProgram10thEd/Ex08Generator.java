package deitelHowToProgram10thEd;

public class Ex08Generator {
    public static void main(String[] args) {
        int rand;

        for (int i = 0; i < 5; i++) {
            rand = (int) (Math.random() * 10001);
            System.out.println("Generated: " + rand);
        }

    }
}
