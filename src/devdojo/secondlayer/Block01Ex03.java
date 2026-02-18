package devdojo.secondlayer;

//3. Leia 5 números e mostre a soma.
public class Block01Ex03 {
    public static void main(String[] args) {
        double nums;
        double sum = 0;

        for (int i = 0; i < 5; i++) {
            nums = Math.random() * 11;

            System.out.printf("Num: %.2f %n", nums);

            sum += nums;

        }


        System.out.printf("Sum: %.2f %n", sum);

    }
}
