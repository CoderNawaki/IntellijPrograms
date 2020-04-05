package MovingForward;
import java.io.*;

class Todo5 {
    public static void main(String[] args) {
        char grade ='B';
        int point;
        switch (grade)
        {
            case 'A' : point = 4;
            break;
            case 'B' : point = 3;
            break;
            case 'C' : point = 2;
            break;
            case 'D' : point = 1;
            break;
            default: point = 0;
        }
        System.out.println(point);
    }
}