package devdojo.exdebug;

public class ExDebug07 {
    public static void main(String[] args) {
        int rand;

        for (int i = 0; i < 5; i++) {

            rand = (int) (Math.random() * 8);

            switch (rand) {
                case 0:
                    System.out.println("Saturday");
                    break;
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Weddnesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Invalid.");
                    break;
            }

        }

    }
}
