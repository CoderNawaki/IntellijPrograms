package Gui;
//Show the image
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App3 extends Frame
{
    Image im;

    public static void main(String[] args) {
        App3 app3 = new App3();
    }
    public App3()
    {
        super("HelloApp");
        Toolkit tk = getToolkit();// using toolkit to get image
        im = tk.getImage("IMG_0475.JPG");//getting image
        addWindowFocusListener(new SampleWindowListener());
        setSize(250,200);
        setVisible(true);
    }
    public void paint(Graphics g) //override the paint method
    {

        g.drawImage(im,-700,-700,this); //process to upload the image
    }
    class SampleWindowListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
}
