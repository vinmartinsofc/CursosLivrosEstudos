package devdojo.excontinue;

public class ExContinue07 {
    public static void main(String[] args) {
        int numbers = 0;

        for (int i = 0; i < 80; i++) {
            numbers++;


            if (numbers >= 40 && numbers <= 60) {
                continue;
            }

            System.out.println("Showing Numbers: " + numbers);
        }



    }
}
