package Gui;
import java.awt.*;
import java.awt.event.*;
public class App extends Frame // 1 extending the class.
{
   private Label lb;

    public static void main(String[] args) {
        App app = new App();
    }
    public App()
    {
        super("Lama app");
        lb = new Label("        its sucking and fucking bitch");
        add(lb);
        lb.setForeground(Color.BLUE);
        lb.setFont(new Font("serif",Font.BOLD,20));
        addWindowListener(new SampleWindowListener());
        setSize(200,200);
        setVisible(true);

    }
    class SampleWindowListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
}
