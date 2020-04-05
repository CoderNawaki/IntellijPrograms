package Gui.Tutorial;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class FileChooserExample  extends JFrame implements ActionListener
{
    JMenuBar mb;
    JMenu file;
    JMenuItem open;
    JTextArea area;
    FileChooserExample(){
        open = new JMenuItem("Open file");
        open.addActionListener(this);
        file = new JMenu("File");
        file.add(open);
        mb = new JMenuBar();
        mb.setBounds(0,0,800,20);
        mb.add(file);
        area = new JTextArea(800,800);
        area.setBounds(0,20,800,800);
        add(mb);
        add(area);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==open){
            JFileChooser fc =new JFileChooser();
            int i= fc.showOpenDialog(this);
            if (i==JFileChooser.APPROVE_OPTION){
                File f = fc.getSelectedFile();
                String filepath = f.getPath();
                try{
                    BufferedReader br = new BufferedReader((new FileReader(filepath)));
                    String s1 ="", s2 ="";
                    while((s1=br.readLine())!=null){
                        s2 += s1 +"¥n";
                    }
                    area.setText(s2);
                    br.close();
                }catch(Exception ex){ ex.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        FileChooserExample fce = new FileChooserExample();
        fce.setSize(500,500);
        fce.setLayout(null);
        fce.setVisible(true);
        fce.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
