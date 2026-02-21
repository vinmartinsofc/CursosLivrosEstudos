package devdojo.exfor;

import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {

        int userNumber = (int) (Math.random() * 101);


        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + userNumber + " = " + userNumber * i);
        }


    }
}
