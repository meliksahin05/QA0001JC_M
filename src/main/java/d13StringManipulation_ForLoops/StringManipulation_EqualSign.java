package d13StringManipulation_ForLoops;

public class StringManipulation_EqualSign {

    public static void main(String[] args) {

        //"==" vs "equals();
        //The difference between is Heap Memory and Stack Memory


        //Memory Management in java: is performed by JVM (Java Virtual Machine) automatically....

        //We have two main memory= Heap memory and Stack memory

        //HEAP MEMORY => 1) Dynamically created objects are stored in Heap Memory
        //I mean when we use "new" keyword, we are using Heap Memory.. (like => new Scanner)

        //Stack Memory is used to call methods and local variables (int  x = 10;)

        //Stack memory is faster than Heap memory, and has limited space. We have addressess(references) here....

        //Primitive data typed is stored in Stack Memory
        //Non primitive data typed is stored in Heap Memory




        String str1 = "Hello";

        String str2 = "Hello";

        System.out.println(str1 == str2); //true
        System.out.println("equals => " + str1.equals(str2)); //true

        //When values are the same, they have same place in heap and address in stack




        System.out.println("=====================================");

        String str4 = new String("Hello"); // created object with new keyword from String class....
        String str5 = new String("Hello");
        //whenever I have "new" keyword, they have different places in memory.......

        System.out.println(str4 == str5); //false
        System.out.println("equals => " + str4.equals(str5)); //true

        //"==" => checks values and addresses, even values are the same; if the adress is different
        //it will return false

        //equals methid checks just values, if they are the same value
        // it will return true....


    }


}
