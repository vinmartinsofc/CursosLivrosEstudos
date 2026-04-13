package Deitel.ChapterIV;



import java.util.Scanner;

public class ExChp4437 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int temp;

//        multiplica por var, resultado da multiplicacao de var multiplica por var -1 até chegar zero

        System.out.print("Enter the integer: ");
        int userNumber = scanner.nextInt();


        while (userNumber >= 0) {
            temp = userNumber;

            temp += --userNumber * temp;

            result += temp * userNumber;

        }




        System.out.println("Factorial: " + result);

    }
}
