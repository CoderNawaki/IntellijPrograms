package Gui;

import javax.swing.*;
import java.awt.*;

public class ExampleTextArea
{
    JTextArea area;
    JFrame f;
    ExampleTextArea()
    {
        f = new JFrame();
        area = new JTextArea(200,200);
        area.setBounds(10,20,200,200);

        area.setBackground(Color.BLACK);
        area.setForeground(Color.white);
        area.setText("This is text area");

        f.add(area);
        f.setSize(200,200);
        f.setVisible(true);
        f.setLayout(null);
    }

    public static void main(String[] args) {
        new ExampleTextArea();
    }
}
