package deitelHowToProgram10thEd;

/*
(Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e imprimir o resultado.
[Dica: utilize o operador de resto.]

 */

public class Ex10 {
    public static void main(String[] args) {
        int rand;
        int n1 = 0, n2 = 0;

        for (int i = 0; i < 2; i++) {
            rand = (int) (Math.random() * 65);
            if (i < 1) {
                n1 = rand;
                System.out.printf("Primeiro número gerado e atribuido a n1: %d %n", n1);

            }

            if (i == 1) {
                n2 = rand;
                System.out.printf("Segundo número gerado e atribuito a n2: %d %n", n2);

            }

        }

        if (n1 % n2 == 0) {
            System.out.printf("N1 múltiplo de n2: %d", n1);
        } else if (n2 % n1 == 0) {
            System.out.printf("N2 é múltiplo de n1: %d", n2);
        } else {
            System.out.println("Nenhum múltiplo");
        }


    }
}
