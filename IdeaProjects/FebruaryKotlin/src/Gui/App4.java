package Gui;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//create the image by mouse
public class App4 extends Frame
{
    int x = 10;
    int y= 10;

    public static void main(String[] args) {
        App4 app4 = new App4();
    }
    public App4()
    {
        super("Sample");
        addWindowListener(new SampleWindowListener());
        addMouseListener(new  SampleMouseListener());
        setSize(250,200);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillOval(x , y, 10,10);
    }
    class SampleWindowListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
    class SampleMouseListener extends MouseAdapter
    {
        public void mousePressed(MouseEvent e)
        {
            x =e.getX();
            y =e.getY();
        }
    }
}
