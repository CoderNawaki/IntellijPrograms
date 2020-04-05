package Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DialogBox extends JDialog {
    public DialogBox()
    {
        initUI();
    }
    public final void initUI()
    {
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        add(Box.createRigidArea(new Dimension(0,10)));
        //place the icon in the class path.
            ImageIcon icon = new ImageIcon("icon.png");
            JLabel label = new JLabel(icon);
            label.setAlignmentX(0.5f);
            add(label);
        add(Box.createRigidArea(new Dimension(0,10)));
        JLabel name = new JLabel("java programs,14.0");
        name.setFont(new Font("serif",Font.BOLD,13));
        name.setAlignmentX(0.5f);
        add(name);
            add(Box.createRigidArea(new Dimension(0,50)));
            JButton close = new JButton("Close");
            close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }});
        close.setAlignmentX(0.5f);
        add(close);
        setModalityType(ModalityType.APPLICATION_MODAL);

            setTitle("About java programs");
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);
            setSize(300,200);
            setVisible(true);
    }
    public static void main(String[] args) {
        new DialogBox();
    }
}
