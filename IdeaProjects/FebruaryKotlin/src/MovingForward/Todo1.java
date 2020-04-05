package MovingForward;

public class Todo1 //same package as Car.java and it is using Car class.
{
    public static void main(String[] args) {
        Car car = new Car(1234,20.5);  //calling Car class inside Todo1
        car.imshow(); //super interface method
        car.vshow();  //sub interface method
    }
}
/*
group of class of different packages are called namespace.
namespace is used as domain name of company or your own.
if Nawaki.com is my domain then i can use com.nawaki.name;
 */
