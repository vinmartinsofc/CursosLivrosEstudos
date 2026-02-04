package devdojo.exfor;

//* Leia 10 números e calcule a média.

public class For12 {
    public static void main(String[] args) {

        double totalNumbers = 0d;
        double count = 0d;
        String msg;
        for (int i = 0; i < 10; i++) {

            double rand = Math.random() * 10;
            totalNumbers += rand;
            count++;

        }

        msg = """
                Total: %.2f
                Avg: %.2f
                """.formatted(totalNumbers, (totalNumbers / count));
        System.out.println(msg);




    }
}

