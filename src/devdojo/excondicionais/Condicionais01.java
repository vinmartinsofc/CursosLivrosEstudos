package devdojo.excondicionais;

import java.util.Scanner;

public class Condicionais01 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);

        System.out.println("Number??");

        int inteiro = inpt.nextInt();

        if (inteiro > 0) {
            System.out.println("Your number is positive!");
        } else if (inteiro < 0) {
            System.out.println("Your number is negative!");
        } else  {
            System.out.println("Your number is Zero!");
        }



    }


}
