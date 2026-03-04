package devdojo.exfor;

public class For07Test {
    public static void main(String[] args) {
        int maior = 0;

        for (int i = 0; i < 5; i++) {
            int num = (int) (Math.random() * 11);

            if (i == 0) {
                maior = num;
            } else if (num > maior) {
                maior = num;
            }

            System.out.println("Números: " + i + num);
        }

        System.out.println("Maior: " + maior);
    }
}
