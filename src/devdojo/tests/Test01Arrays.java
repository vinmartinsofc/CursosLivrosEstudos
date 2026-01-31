package devdojo.tests;

public class Test01Arrays {
    public static void main(String[] args) {
       double[] numbers = new double[5];

       numbers[0] = 6.5;
       numbers[1] = 8.0;
       numbers[2] = 6.5;
       numbers[3] = 7.7;
       numbers[4] = 4.5;


       for (double nums:numbers ) {
           System.out.println(numbers.length);
       }

        int[] idades = new int[10];
        for (int i = 0; i < 10; i++) {
            idades[i] = i * 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(idades[i]);
        }


    }


}
