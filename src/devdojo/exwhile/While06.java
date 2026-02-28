package devdojo.exwhile;

import java.util.Scanner;

public class While06 {
    public static void main(String[] args) {
        // Simule um menu que só encerra quando escolher “Sair”.
        Scanner input = new Scanner(System.in);
        String menuOption = "";
        String menuDisplay = """
                Option 1
                Option 2
                Option 3
                Option 4
                Option 5
                exit
                """;
        while (!menuOption.equalsIgnoreCase("exit")) {
            System.out.println(menuDisplay);
            menuOption = input.next();
        }


    }
}
