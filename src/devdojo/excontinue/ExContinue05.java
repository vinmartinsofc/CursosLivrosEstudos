package devdojo.excontinue;

public class ExContinue05 {
    public static void main(String[] args) {
        int rand;
        int count = 0;
        int totalCount = 0;


        for (int i = 0; i < 100; i++) {
            rand = (int) (Math.random() * 101);


            if (rand == 0) {
                System.out.println("Zero: " + rand + " at count: " + totalCount);
                count++;
                continue;
            }

            System.out.println("Number: " + rand);
            totalCount++;
        }

        System.out.printf("Total numbers: %d %n", totalCount);
        System.out.printf("Total 0 generated: %d  %n", count);


    }

}
