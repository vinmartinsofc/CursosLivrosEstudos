package devdojo.exarrays;

public class arrays02 {
    public static void main(String[] args) {
        int[] contas = new int[10];

        for (int i = 0; i < contas.length ; i++) {
            int gerador = (int) (Math.random() * 100);
            contas[i] = gerador;

        }

        for (int x: contas) {
            System.out.println(x);

        }


    }
}
