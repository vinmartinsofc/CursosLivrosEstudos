package devdojo.exfor.extra;

public class ExtraFor02 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            int random = (int) (Math.random() * 20);

            int soma = 0;
            soma += random;

            System.out.println("Números: " + random);

            System.out.println(soma);

//            if (i == 5) {
//                System.out.println("Soma: " + soma);
//            }

        }
    }
}
