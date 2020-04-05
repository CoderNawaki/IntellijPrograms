package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ExampleActionEvent extends JFrame implements ActionListener
{
    private JList list;
    private DefaultListModel model;

    public ExampleActionEvent()
    {
        initUI();
    }
    public final void initUI()
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        model = new DefaultListModel();
        list = new JList(model);
        list.setBounds(150,30,220,150);

        JButton btn = new JButton("OK");
        btn.setBounds(30,35,80,25);

        btn.addActionListener(this);

        panel.add(btn);
        panel.add(list);
        add(panel);
        setTitle("ActionEvent");
        setSize(420,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        Locale locale = Locale.getDefault();
        Date date = new Date(e.getWhen());
        String s = DateFormat.getTimeInstance(DateFormat.SHORT,locale).format(date);

        if (!model.isEmpty())
        {
            model.clear();
        }
        if (e.getID()== ActionEvent.ACTION_PERFORMED)
        {
            model.addElement("Event id: ACTION_PERFORMED");
        }
        model.addElement("Time:"+ s);

        String source = e.getSource().getClass().getName();
        model.addElement("Source:"+source);

        int mod = e.getModifiers();
        StringBuffer buffer = new StringBuffer("Modifiers:");

        if((mod&ActionEvent.ALT_MASK)>0)
        {
            buffer.append("Alt");
        }
        if ((mod&ActionEvent.SHIFT_MASK)>0)
        {
            buffer.append("Shift");
        }
        if ((mod&ActionEvent.META_MASK)>0)
        {
            buffer.append("meta");
        }
        if ((mod&ActionEvent.CTRL_MASK)>0)
        {
            buffer.append("Ctrl");
        }
        model.addElement(buffer);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ExampleActionEvent eve = new ExampleActionEvent();
                eve.setVisible(true);
            }
        });
    }

}
