package MovingForward; //Todo2 is inside MovingForward as different package
import Moving.Bus; //import for not using Moving.Bus bus = new Moving.Bus
public class Todo2
{
    public static void main(String[] args)
    {
        Bus bus = new Bus();//by import using we can use normally only class.
        bus.setBus(1234,20.5);
        bus.show();
    }
}
