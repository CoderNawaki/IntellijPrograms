import java.util.Scanner;//very useful API

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner in = new Scanner(System.in);//declare the scanner class
       int a,b,c;
        System.out.print("input number1 is:");
        a = in.nextInt();//user input into integer
        System.out.print("input number2 is:");
        b=in.nextInt();
        c = a+b;
        System.out.println(a+"+"+b+"="+c);
    }
}


