package devdojo.exwhile;

//* Leia números até que sejam maiores que 100.

public class While16 {
    public static void main(String[] args) {

        double sum = 0;
        double numbers;
        do {
            numbers = Math.random() * 11;
            sum += numbers;
            System.out.printf("Counting.....%.2f %n", sum);

        } while (sum <= 100);

        System.out.printf("Total: %.2f %n ", sum);

    }
}
