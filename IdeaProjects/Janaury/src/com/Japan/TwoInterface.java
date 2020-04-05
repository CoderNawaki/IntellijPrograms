package com.Japan;

interface iVehicle
{
    public void vshow();
}

interface iMaterial
{
    public void mshow();
}

class Cars implements iVehicle,iMaterial
{
    private int num;
    private double gas;

    public Cars(int n,double g)
    {
        num= n;
        gas = g;
        System.out.println("number is :"+num +"and gas is set to :"+gas);
    }
    public void vshow()
        {
            System.out.println("number of car is :"+num);
            System.out.println("number of gas is : "+gas);
        }
        public void mshow()
        {
            System.out.println("the material of the car is iron. ");
        }
}
class TwoInterface
{
    public static void main(String[] args) {
        Cars car1 = new Cars(1234,30.5);
        car1.vshow();
        car1.mshow();
    }
}