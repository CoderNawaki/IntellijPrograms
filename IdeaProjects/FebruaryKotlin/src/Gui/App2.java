package Gui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App2 extends Frame
{
    private Button bt;
    public static void main(String args[])
    {
        App2 app2 = new App2();
    }
    public App2()
    {
        super("sample");
        bt = new Button("Hello");
        add(bt);
        addWindowListener(new SampleWindowListener());
        bt.addMouseListener(new SampleMouseListener());

        setSize(250,250);
        setVisible(true);

    }
    class SampleWindowListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
    class SampleMouseListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e){}
        public void mouseReleased(MouseEvent e){}
        public void mousePressed(MouseEvent e){}
        public void mouseEntered(MouseEvent e)
        {
            bt.setLabel("Hello");
        }
        public void mouseExited(MouseEvent e)
        {
            bt.setLabel("Welcome to the Intellij IDEA");
        }
    }
}
