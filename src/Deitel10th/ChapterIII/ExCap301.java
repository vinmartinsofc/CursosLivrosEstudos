package Deitel10th.ChapterIII;

import javax.swing.*;

public class ExCap301 {
    public static void main(String[] args) {

        //prompt the user to enter the integer (similar to JavaScript prompt)
        String n1 = JOptionPane.showInputDialog("Enter the first integer");
        String n2 = JOptionPane.showInputDialog("Enter the second integer");

        //converts the string to integer numbers so  that the sum can be performed
        int n1AsAnInteger = Integer.parseInt(n1);
        int n2AsAnInteger = Integer.parseInt(n2);
        int sum = n1AsAnInteger + n2AsAnInteger;

        String msg = String.format("The result is: %d! %n", sum);

        JOptionPane.showMessageDialog(null, msg);

    }
}
