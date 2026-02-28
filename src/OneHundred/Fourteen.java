package OneHundred;

public class Fourteen {
    public static void main(String[] args) {
        int rand;
        int count = 0;
        int avg = 0;
        int total = 0;

        while (count < 10) {
            rand = (int) (Math.random() * 11);
            total += rand;
            count++;
            System.out.println("Debug rand: " + rand);
            System.out.println("Debug count: " + count);
        }
        avg = total / count;

        System.out.printf("%nAvg is: %d", avg);


    }
}
