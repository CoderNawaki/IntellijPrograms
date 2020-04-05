package Applet;

import java.applet.Applet;
import java.awt.*;

public class First extends Applet {
    public void paint(Graphics g){
        g.drawString("Welcome to applet",150,150);
    }
}
/*
<applet code = "First.class" width ="300" height = "300">
</applet>
 */
