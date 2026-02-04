package devdojo.exwhile;
// Leia senhas até que a senha correta seja digitada.

import java.util.Scanner;

public class While08
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        String password = "";

        while (!password.equalsIgnoreCase("correct password"))
        {
            System.out.println("Whats the passwod??");
            password = input.nextLine();

            if (password.equalsIgnoreCase("correct password"))
            {

                System.out.println("You did it!");
            }

        }

    }
}
