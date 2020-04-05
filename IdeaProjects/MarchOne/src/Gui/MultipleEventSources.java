package Gui;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.basic.BasicButtonListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleEventSources extends JFrame
{
    JLabel statusbar;

    public MultipleEventSources()
    {
        initUI();
    }
    public final void initUI()
    {
        JPanel panel = new JPanel();
        statusbar = new JLabel("click on any button");
        statusbar.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));

        panel.setLayout(null);

        JButton close = new JButton("button 1");
        close.setBounds(40,30,90,25);
        close.addActionListener(new BasicButtonListener());

        JButton open = new JButton("Button 2");
        open.setBounds(40,80,90,25);
        open.addActionListener(new BasicButtonListener());

        JButton find = new JButton("Button 3");
        find.setBounds(40,130,90,25);
        find.addActionListener(new BasicButtonListener());

        JButton save = new JButton("Button 4");
        save.setBounds(40,180,90,25);
        save.addActionListener(new BasicButtonListener());

        panel.add(close);
        panel.add(open);
        panel.add(find);
        panel.add(save);
        add(panel);
        add(statusbar, BorderLayout.SOUTH);

        setTitle("MultipleEventExample");
        setSize(250,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    class BasicButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        JButton o = (JButton)e.getSource();
        String label = o.getText();
        statusbar.setText(""+label +"button clicked");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MultipleEventSources mes = new MultipleEventSources();
                mes.setVisible(true);
            }
        });
    }
}
