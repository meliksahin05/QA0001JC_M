package d4Scanner_Concatenation;


import java.util.Scanner;

public class Scanner06 {

    //type main method. DO NOT FORGET
    public static void main(String[] args) {


        //Example: Ask user to enter the width and the length of a rectangle
        //Then print the area and perimeter on the console

        //Area: width*length
        //Perimeter = 2*width + 2*length
        //use float data type

        //Create an instance from the Scanner Class
        Scanner  input = new Scanner(System.in);

        //Give a message to user....
        System.out.println("Please enter a value for width and lenght");

        //Create the methods
        float width = input.nextFloat();
        float lenght = input.nextFloat();

        System.out.println("AREA ;" + width*lenght);
        System.out.println("Perimeter ; " + (2*(width + lenght)));


    }
}
