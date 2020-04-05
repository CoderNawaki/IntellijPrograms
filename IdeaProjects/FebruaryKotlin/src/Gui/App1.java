package Gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App1 extends Frame
{
    private Label lb;
    private Button bt;
    public static void main(String args[])
    {
        App1 app1 = new App1();
    }
    public App1()
    {
        super("Sample app");
                bt = new Button("Hello");//create the button
                add(bt); //add the button
                addWindowListener(new SampleWindowListener());
                bt.addActionListener(new SampleActionListener());//add event handler
                setSize(250,200);
                setVisible(true);
    }
    class SampleWindowListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
    class SampleActionListener implements ActionListener//event listener
    {
        public void actionPerformed(ActionEvent e)//called when even is happen
        {
            bt.setLabel("world");
        }
    }


}
