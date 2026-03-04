package devdojo.secondlayer;

public class Block01Ex04 {
    public static void main(String[] args) {
        double nums;
        double sum = 0;
        double avg = 0;
        int count = 0;

        for (int i = 0; i < 5; i++) {
            count++;
            nums = Math.random() * 11;

            System.out.printf("Num: %.2f %n", nums);

            sum += nums;

            avg = sum / count;

        }


        System.out.printf("Avg: %.2f %n", avg);


    }
}
