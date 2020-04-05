package MovingForward;
import java.io.*;
public class Todo8
{
    public static void main(String[] args) {
        try{
            /*
            First create the stream to read the file by giving name.
            By through BufferedReader read the file
            read the file sentence one by one with br.readLine()
             */
            BufferedReader br = new BufferedReader
                    (new FileReader("test.txt"));

            String str1 = br.readLine();
            String str2 = br.readLine();

            System.out.println("two sentence input inside file is");

            System.out.println(str1);
            System.out.println(str2);
            br.close();
        }catch (IOException e){
            System.out.println("input Error");
        }
    }
}
