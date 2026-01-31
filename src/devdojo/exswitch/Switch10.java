package devdojo.exswitch;

public class Switch10 {
    public static void main(String[] args) {
        int[] numbers = new int[7];


        for (int i = 0; i < 7; i++) {
            int generator = (int) (Math.random() * 7);
            numbers[i] = generator;
        }
    
        for (int n: numbers) {
            switch (n) {
                case 0:
                    System.out.println("Domingo.");
                    break;
                case 1:
                    System.out.println("Segunda-Feira.");
                    break;
                case 2:
                    System.out.println("Terça-Feira.");
                    break;
                case 3:
                    System.out.println("Quarta-Feira.");
                    break;
                case 4:
                    System.out.println("Quinta-Feira.");
                    break;
                case 5:
                    System.out.println("Sexta-Feira.");
                default:
                    System.out.println("Sábado.");
            }


        }

    }
}
