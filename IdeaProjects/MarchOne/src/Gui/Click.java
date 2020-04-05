package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Click implements ActionListener
{
    private int count = 0;
    private JLabel  label;
    private JFrame frame;
    private JPanel panel;

    public Click(){

        JFrame frame = new JFrame();
        //create the jButton
        JButton button = new JButton("click me");
        button.addActionListener(this);

        label = new JLabel("Number of click: 0");


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our example on gui");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Click();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("Number of click:"+count);
    }

}
