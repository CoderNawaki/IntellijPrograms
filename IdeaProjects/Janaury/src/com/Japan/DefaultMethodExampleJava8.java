package com.Japan;
/*java has a new concept of default method
implementation in interfaces.its very useful for
old interfaces which can be used lambda expression
 */
public class DefaultMethodExampleJava8 {
    public static void main(String[] args) {
        Vehicle vehicle= new Car();
        vehicle.print();
    }
}
interface Vehicle{
    default void print(){
        System.out.println("I am vehicle!");
    }
    static void blowHorn(){//in java8 static helper method also can be used
        System.out.println("Blowing horn");
    }
}
interface FourWheeler{
    default void print(){
        System.out.println("I am four wheeler");
    }
}
//create an own method that overrides default implementation
class Car implements Vehicle,FourWheeler{
    public void print(){
        Vehicle.super.print();//used super to call default method
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("I am a car!");
    }
}
