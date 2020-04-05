package MovingForward;
 //generic method printArray
public class Todo3
{
    public static <E> void printArray(E[] inputArray)
    {//E is type parameter and E[] is return type
        //display array elements
        for (E element :inputArray){
            System.out.printf("%s",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //create arrays of Integer,Double and Character
        Integer[] intArray= {1,2,3,4,5};
        Double [] doubleArray = {1.1,2.2,3.3,4.4};
        Character[] charArray = {'H','E','L','L','o'};

        System.out.println("Array integerArray contains:");
        printArray(intArray); //pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);//pass a double array

        System.out.println("\nArray characterArray contains");
        printArray(charArray); //pass a character array
    }
}
