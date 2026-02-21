package devdojo.exswitch;

public class Switch08 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 4);

        switch (random) {
            case 0:
                System.out.println("Janeiro");
                break;
            case 1:
                System.out.println("Fevereiro");
                break;
            case 2:
                System.out.println("Março");
                break;
            case 3:
                System.out.println("Abril");
                break;
            default:
                System.out.println("????");
        }


    }
}
