package MovingForward.Sub;
import Moving.Bus; //imported package;

//we can import any numbers of package and class;
/*
import java.io.*;

this include all the class inside this package. But this doesn't include sub package,
so we can call by own like

import java.awt.image.*;
 */

public class Todo4
{
    public static void main(String[] args) {
        Bus bus = new Bus(); //by import package u don't have to use package name;
        bus.setBus(1234,20.5);
        bus.show();
    }
}