package deitelHowToProgram10thEd;

public class Ex03Generator {
    public static void main(String[] args) {
        int rand;

        for (int i = 0; i < 3; i++) {
            rand = (int) (Math.random() * 99);
            System.out.println("Generated: " + rand);
        }

    }

}
