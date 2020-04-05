package MovingForward;
import java.io.*;
public class Todo7
{
    public static void main(String[] args) {
        try {
            /*
            first by giving file name,prepare the string stream.and then
            with BufferedWriter try to write.PrintWriter prepare to write one
            line by line.
            pw.println  write one by one.
            close() close the file.
             */

        PrintWriter pw = new PrintWriter(new BufferedWriter
                (new FileWriter("test.txt")));

            pw.println("hello! devs it's junior dev Lama");
            pw.println("goodnight");//these two line write into file one by one.

            System.out.println("Entered the text");
            pw.close();//close the file
        }catch (IOException e) {
            System.out.println("input error");
        }
    }
}
