package devdojo.excontinue;

public class ExContinue11 {
    public static void main(String[] args) {
        String dayOfWeek = "";
        int rand = 0;

        for (int i = 0; i < 51; i++) {
            rand = (int) (Math.random() * 8);

            if (rand > 2 ) {
                dayOfWeek = "Its not Weekend";
            } else {
                dayOfWeek = "Weekend";
            }

            if (dayOfWeek.contains("Its not Weekend")) {
                continue;
            }

            System.out.println(dayOfWeek);

        }

    }
}
