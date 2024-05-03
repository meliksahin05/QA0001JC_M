package d3Variables_TypeCasting_WrapperClass;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        
        
        //Example: Ask user to enter two numbers then do addition and multiplication operations with the numbers
        
        //1.Step Create a scanner class object 
        Scanner input = new Scanner(System.in);
        
        //2.step give a message to the user
        System.out.println("Enter your password into the login page of the facebook");

        //3 Select proper method to get the data from the user
        int num = input.nextInt();


        System.out.println("This is your password : " + num);


        //Example: Ask user to enter two numbers then do addition and multiplication operations with the numbers

        //1 step Create a scanner class object
        Scanner input1 = new Scanner(System.in);

        //2Give a message to user
        System.out.println("Enter first number...");

        //3 Select proper method and get the data from the user
        double num1 = input1.nextDouble();

        //Second Number
        System.out.println("Enter second your number");

        double num2 = input1.nextDouble();

        System.out.println("The sum is ; " + (num1+num2));
        System.out.println("The multiplication is ;" + num1*num2);




        
    }
}
