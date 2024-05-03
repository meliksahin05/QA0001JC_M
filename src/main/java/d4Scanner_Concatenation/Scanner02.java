package d4Scanner_Concatenation;

import java.util.Scanner; // imported from util package

public class Scanner02 {

    public static void main(String[] args) {


        //I wanna get input from another system; so i need something more in my class
        //so far we assigned all the data inside the class on my own
        //but this time, i will allow an external user to enter data into my system

        //HOW TO GET DATA FROM THE USER
        //1. Scanner input = new Scanner(System.in); ===> create an object from the scanner class
        //2. System.out.println(give a message to user);
        //3. int number = input.nextInt();
        //4. System.out.println(number);

        //nextBoolean() =====> Reads a boolean data type from the user
        //nextByte() =====> Reads a byte data type from the user
        //nextDouble() =====> Reads a double data type from the user
        //nextInt() =====> Reads a int data type from the user
        //nextFloat() =====> Reads a float data type from the user
        //nextLine() =====> Reads a String data type from the user
        //nextLong() =====> Reads a Long data type from the user
        //nextShort() =====> Reads a short data type from the user

//        how to create object
        //CLASS NAME       + OBJECT NAME +   ASSIGNMENT OP.   + KEYWORD   + CONSTRUCTOR
        Scanner               entry                =              new         Scanner (System.in); // input wiill come through the parameter of scanner class

        //What is the logic of system.in? Im taking something into on the console //System.in is used to read data from keyboard
        //What is the logic of system.out? Im giving something to on the console.

        //Tell the user what you want
        System.out.println("Please enter your age");

        //then user will enter the age by the help of object from the Scanner class
        byte age = entry.nextByte();
        byte age1 = entry.nextByte();

        System.out.println("Entered age by user ; " + age); //print entered age by user
        System.out.println("Entered age by user ; " + age1); //print entered age by user



    }
}
