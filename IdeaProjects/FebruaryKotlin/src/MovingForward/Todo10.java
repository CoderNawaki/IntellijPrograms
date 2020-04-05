package MovingForward;
/*
Thread can be created in two ways.
First: extending thread class as this example.
Second: apply the runnable interface as second example.
both work in same way.
 */
class Car2 extends Thread //extend the thread class.
{
    private String name;
    public Car2(String nm)
    {
        name = nm;
    }
    public void run()
    {
            System.out.println("process of"+name+"are doing.");
    }
}
public class Todo10
{
    public static void main(String[] args) {
        Car2 car2 = new Car2("First Car");//object are created.
        car2.start();// new thread are created.
        System.out.println("process of main are doing.");
    }
}
