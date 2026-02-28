package devdojo.excondicionais;

public class Condicionais02 {

    public static void main(String[] args) {

        for (int i = 10; true; i--) {

            int generator = (int) (Math.random() * 10);

            System.out.println(generator);

            if (i == 0) {
                break;
            }

        }

    }

}
