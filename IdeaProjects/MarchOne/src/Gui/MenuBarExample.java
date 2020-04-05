package Gui;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderRepeat;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MenuBarExample {
    private  static void createAndShowGUI(){
        //create and set up the window.
        JFrame frame = new JFrame("MenuBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create the menu bar with having green background.
        JMenuBar greenMenuBar = new JMenuBar();
        greenMenuBar.setOpaque(true);
        greenMenuBar.setBackground(new Color(154,165,127));
        greenMenuBar.setPreferredSize(new Dimension(200,20));
        //create yellow label to put in the contentPane.
        JLabel yellowLabel = new JLabel();
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(248,213,131));
        yellowLabel.setPreferredSize(new Dimension(200,180));

        //set menu bar  and add the label to the content pane.
        frame.setJMenuBar(greenMenuBar);
        frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
        //display the window
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //schedule the job for the event dispatching thread.
        //creating and showing this application gui.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
