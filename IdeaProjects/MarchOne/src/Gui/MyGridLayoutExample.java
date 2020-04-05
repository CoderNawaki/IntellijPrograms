package Gui;

import javax.swing.*;
import java.awt.*;

public class MyGridLayoutExample
{
    JFrame frm;

    MyGridLayoutExample()
    {
        frm = new JFrame("GridLayoutExample");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");

        frm.add(btn1);
        frm.add(btn2);
        frm.add(btn3);
        frm.add(btn4);
        frm.setLayout(new GridLayout(3,3));
        //setting grid layout of 3 rows and 3 cols
        frm.setSize(200,200);
        frm.setVisible(true);
    }

    public static void main(String[] args) {
        new MyGridLayoutExample();
    }
}
