package Gui;

import javax.swing.*;
import java.awt.*;

public class TooltipExample extends JFrame
{
    public TooltipExample()
    {
        initUI();
    }
    private void initUI()
    {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(null);
        panel.setToolTipText("this is panel");

        JButton button = new JButton("Button");
        button.setBounds(100,60,100,30);
        button.setToolTipText("this is a button");
        panel.add(button);

        setTitle("TooltipExample");
        setSize(200,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TooltipExample ex = new TooltipExample();
                ex.setVisible(true);
            }
        });
    }
}
