package MovingForward;

class BikeException extends Exception //creating the exception class
{

}
class Bike
{
    private int num;
    private double gas;
    public Bike()
    {
        num = 0;
        gas = 0.0;
        System.out.println("create the Bike");
    }
    public void setBike(int n, double g) throws BikeException//declared exception throw method
    {
        if (g<0){
            BikeException e = new BikeException();
            throw e; //throws exception in especial case.
        } else{
            num =n;
            gas = g;
            System.out.println("number is "+num+"and gasoline is "+gas);
        }
    }
    public void show()
    {
        System.out.println("number is "+num);
        System.out.println("gasoline is "+gas);
    }

}

public class Todo6
{
    public static void main(String[] args)
            throws BikeException
    {
        Bike bike = new Bike();
        try{
            bike.setBike(1234,-10.0);//this call the exception
        }catch (BikeException e){
            System.out.println(e+"is outcome");
        }
        bike.show();
    }
}
