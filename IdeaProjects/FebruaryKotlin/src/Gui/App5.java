package Gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App5 extends Frame implements Runnable
{
    int num;
    public static void main(String []args)
    {
        App5 app5 = new App5();
    }
    public App5()
    {
        super("Sample");
        addWindowListener(new SampleWindowListener());
        Thread th;
        th =new Thread(this);
        th.start();
        setSize(250,200);
        setVisible(true);
    }
    public void run()
    {
        try{
            for(int i = 0; i<10;i++){
                num = i;
                repaint();
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){}

    }
    public void paint(Graphics g)
    {
        String str = num +"";
        g.drawString(str,100,100);
    }
    class SampleWindowListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
}
