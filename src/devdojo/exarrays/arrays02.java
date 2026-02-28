package devdojo.exarrays;

/*
Crie uma classe TestaArrays e, no método main, uma array de contas de tamanho dez. Em seguida, faça um laço para criar dez contas com saldos distintos e colocá-las na array. Por exemplo, você pode utilizar o índice do laço e multiplicá-lo por 100 a fim de gerar o saldo de cada conta:

Conta[] contas = new Conta[10];

for (int i = 0; i < contas.length; i++) {
  Conta conta = new ContaCorrente();
  conta.deposita(i * 100.0);
  // Escreva o código para guardar a conta na posição i da array.
}
 */

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
