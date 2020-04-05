package com.Japan.Exercise;
abstract class Vehicle
{
    protected int speed;
    public void setSpeed(int s){
        speed = s;
    System.out.println("speed is set to "+speed);
    }
    abstract void show();
}
//Car class
class Car extends Vehicle
{
  private int num;
  private double gas;

  public Car(int n, double g)
  {
      num = n;
      gas = g;
      System.out.println("number is set to "+num+"and gas is "+gas);

  }
  public void show()
  {
      System.out.println("number is "+num);
      System.out.println("gasoline is"+gas);
      System.out.println("speed is "+speed);
  }

}
//plane class
class Plane extends Vehicle {
    private int flight;
    public Plane(int f)
    {
        flight = f;
        System.out.println("flight number of plane is"+flight);
    }
    public void show()
    {
        System.out.println("flight number is "+flight);
        System.out.println("speed is "+speed);
    }
}
class Exercise{
    public static void main(String[] args) {
        Vehicle[] vc;
        vc = new Vehicle[2];
        vc[0]= new Car(1234,20.5);
        vc[0].setSpeed(60);

        vc[1] = new Plane(250);
        vc[1].setSpeed(500);

        for (int i=0;i<vc.length;i++)
        {
           if (vc[i] instanceof Car)
               System.out.println((i+1) +"number of object is Car class");
           else
               System.out.println((i+1)+"number of object is not car class.");
        }
    }
}


