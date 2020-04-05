package Gui;

import javax.swing.*;
import java.awt.*;

public class JbExample extends JFrame
{
    JPanel panel = new JPanel();
    JButton button = new JButton("Click me bitch");
         JbExample() //the frame constructor
         {
             super("JButton Example");


             setBounds(100,100,300,200);

             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             Container con = this.getContentPane();//inherit the main frame
             con.add(panel);//panel containers default to Flow layout
             button.setMnemonic('P');//associate hot key to button

             panel.add(button);
             button.requestFocus();
             setVisible(true); //make frame visible

         }

    public static void main(String[] args)
    {
        new JbExample();
    }
}
