package Moving; //new package and Bus is inside the Moving

public class Bus        //use access modifier "public"
{
    private int num;
    private double gas;

    public Bus()
    {
        num= 0;
        gas = 0.0;
        System.out.println("Created the Bus");
    }
    public void setBus(int n , double g)
    {
        num = n;
        gas = g;
        System.out.println("number is set to "+num+ "and gas is set to "+gas);
    }
    public void show()
    {
        System.out.println("number is "+ num);
        System.out.println("gas usage of Bus is"+gas);
    }
}
