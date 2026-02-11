package deitelHowToProgram10thEd;

/*
(Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador
de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
 */

public class Ex09 {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 101);


        if (rand % 2 == 0) {
            System.out.println("Par: " + rand);
        } else {
            System.out.println("Impar: " + rand);
        }

    }
}
