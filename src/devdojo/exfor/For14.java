package devdojo.exfor;

// Calcule o fatorial de um número.
public class For14 {

    public static void main(String[] args) {
        int rand = 5;
//        int rand = (int) (Math.random() * 11);
        int temp = rand;
        int result = 0;
        int result2 = 0;


        System.out.println("Number is: " + rand);

        for (int i = 1; i < 6; i++) {

            result += rand * temp;

            result2 += result  * result;

            temp--;

        }

        System.out.printf("The factorial of %d is: %d %n ", rand, result);

    }

}
