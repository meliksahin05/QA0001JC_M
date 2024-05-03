package d5Scanner_IfStatement_Concatenation;

import java.util.Scanner;

public class Scanner07 {

    //type main method
    public static void main(String[] args) {


        //Example: type code gets mile from the user then converts it to kilometers
        // 1 mile is 1.6 km


        //HOW TO GET DATA FROM THE USER
        //1. Scanner input = new Scanner(System.in); ===> create an object from the scanner class
        //2. System.out.println(give a message to user);
        //3. int number = input.nextInt();
        //4. System.out.println(number);

        //Create an object from Scanner Class
        Scanner input = new Scanner(System.in);

        //Give a message to user
        System.out.println("Enter Value......");

        //Create a method
        double mile = input.nextDouble();

        System.out.println(mile + " mile is " + mile*1.6 + " km");
    }
}
