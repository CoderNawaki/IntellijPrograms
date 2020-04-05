package MovingForward;

import java.io.IOException;
class Car1 implements Runnable //apply the runnable interface
{
    private String name;

    public Car1(String nm)
    {
        name = nm;
    }
    public void run() { // declare the run method.
        for (int i = 0; i < 2; i++)
            System.out.println(name+"process is doing.");
            }
    }
 class Todo9
{
    public static void main(String[] args) {
        /*
        job are done through main thread.
        while the running thread or job is long, then main thread have to wait
         */
    Car1 car = new Car1("1nm car");
   Thread thread = new Thread(car); //create the object of thread class.
   thread.start(); //
    for(int i=0;i<3;i++) {
        try{
            Thread.sleep(1000);
            System.out.println("main() process is doing");
        } catch (InterruptedException e){}

        }
    }
}
