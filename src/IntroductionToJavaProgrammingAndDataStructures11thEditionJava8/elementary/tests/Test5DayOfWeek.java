package IntroductionToJavaProgrammingAndDataStructures11thEditionJava8.elementary.tests;

import java.util.Scanner;

public class Test5DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What day is it? (1 to 7 with which 1 representing Sunday)");
        int dayOfWeek = input.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thurday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
                break;

        }


    }

}
