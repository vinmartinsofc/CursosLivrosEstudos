package devdojo.exerciciosswitch;

public class Switch01 {
    public static void main(String[] args) {
        int generator = (int) (Math.random() * 13);

        switch (generator) {
            case 0:
                System.out.println("O Mês é Janeiro.");
                break;
            case 1:
                System.out.println("O Mês é Fevereiro.");
                break;
            case 2:
                System.out.println("O Mês é Março.");
                break;
            case 3:
                System.out.println("O Mês é Abril.");
                break;
            case 4:
                System.out.println("O Mês é Maio.");
                break;
            case 5:
                System.out.println("O Mês é Junho.");
                break;
            case 6:
                System.out.println("O Mês é Julho.");
                break;
            case 7:
                System.out.println("O Mês é Agosto.");
                break;
            case 8:
                System.out.println("O Mês é Setembro.");
                break;
            case 9:
                System.out.println("O Mês é Outubro.");
                break;
            case 10:
                System.out.println("O Mês é Novembro.");
                break;
            case 11:
                System.out.println("O Mês é Dezembro.");
                break;
            default:
                System.out.println("Não existe um mês para: " + generator + "!");

        }

    }
}
