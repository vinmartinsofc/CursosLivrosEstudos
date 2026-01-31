package devdojo.exarrays;

public class arrays01 {
    public static void main(String[] args) {

        double[] duploCup = new double[5];

//           double[] duploCup2 = {454.0,56.8 ,27.0,58.0};

        for (int i = 0; i < duploCup.length; i++) {

            double generador = (Math.random() * 1000);

            duploCup[i] = generador;

        }

        for (double runner : duploCup) {
            System.out.printf("Double list: %.2f \n", runner);
        }

    }
}
