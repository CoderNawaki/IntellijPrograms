package Gui;

import javax.swing.*;

public class OptionMenuExample
{
    public static void main(String[] args) {
        String fullName="";
        String  Age = "";
        int age = 0;
        fullName = JOptionPane.showInputDialog
                (null,"Enter your full name");

        JOptionPane.showMessageDialog(null,"your full name is"+fullName);
        Age = JOptionPane.showInputDialog(null,"Enter your age");
        age = Integer.parseInt(Age);

        JOptionPane.showConfirmDialog(null,age,"is this your real age?",JOptionPane.OK_CANCEL_OPTION);

        JOptionPane.showMessageDialog(null,"your age is"+age+".");
    }
}
