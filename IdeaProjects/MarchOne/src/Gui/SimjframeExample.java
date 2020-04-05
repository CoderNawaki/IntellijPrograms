package Gui;

import javax.swing.*;

public class SimjframeExample
{
    private static void createAndShowGUI()
    {
        //create and set up the window
        JFrame frame = new JFrame("Hello world");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting the height, width and position
        //of the frame
        frame.setBounds(100,100,200,100);
        //add the Hello world label
        JLabel label = new JLabel("Hello world ");
        frame.getContentPane().add(label);
        //display the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread
        //creating and showing this application gui
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
