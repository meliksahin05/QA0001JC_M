package d23PassByValue_StringBuilder_InstanceBlock;

public class StringBuilder02 {

    public static void main(String[] args) {


        //The append() method is used to add a new String to the StringBuilder object....
        //The capacity() method indicates the size of the allocated and yet unused space characters....

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length()); //0
        System.out.println("sb1.capacity() = " + sb1.capacity()); //16



        sb1.append("Java");
        System.out.println("sb1.length() = " + sb1.length()); //4 ==> used 4 out of 16 capacity
        System.out.println("sb1.capacity() = " + sb1.capacity()); //16


        sb1.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); //13 x appended....
        System.out.println("sb1.length() = " + sb1.length()); //17
        System.out.println("sb1.capacity() = " + sb1.capacity()); //34   16+default(16) +2;    //double default value+2

        //After exceeding default capacity, java will provide 16 more and plus 2 capacity....
        //But after that, optimization starts based on the length....
        //If the number of characters are 88, capacity will be 88....

        //Capacity is the number of data storage spaces guven to you by java....
        //lenght is used to portion of the data storage space provided to you....

        // Initially, java gives you a capacity of 16, if you exceed this given capacity, java adjust the new capacity; default +16+2
        //after that limit; optimization starts....

        System.out.println("==========================================================");

        //Can we change the capacity at the begining?
        StringBuilder sb2 = new StringBuilder();
        //if you type int data in constructor, capacity is defined by the digits....

//        sb2.append("Mice");
//        sb2.append("Micheal");
        sb2.append("Michealymmmmm");
        System.out.println("sb2.length() = " + sb2.length()); //7
        System.out.println("sb2.capacity() = " + sb2.capacity()); //5




    }

}
