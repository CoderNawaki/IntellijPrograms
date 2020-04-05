package MovingForward;

interface iMovable                                  //super interface
{
    public void imshow();                           //super interface method
}
interface iVehicle extends iMovable                 //extends ivehicle from imovable as sub interface
{
    public void imshow();                           //method
}
class Car implements iVehicle                       //Car class implements the iVehilce
{
    private int num;
    private double gas;

    public Car(int n, double g)                     //create the car of certain number of number and gas.
    {
        num =n;
        gas = g;
        System.out.println("number of: "+num+"and gas of :"+gas+"car is created.");
    }
    public void imshow()                            //interface method must be called.
    {
        System.out.println("moving things are created for human beneficiary.");
    }
    public void vshow()                             //must be called.
    {
        System.out.println("number of car is :"+num);
        System.out.println("amount of gasoline is : "+gas);
    }
}

