package d6IfStatement;

import java.util.Scanner;

public class IfStatement02 {


    public static void main(String[] args) {


        //Example check the number entered by user if it is even or odd....

        //Create an object from scanner class
        Scanner input = new Scanner(System.in);

        //Give a message to user
        System.out.println("Please enter a number");

        int num = input.nextInt();

        //1 way
        if(num%2==0){
            System.out.println("The number you entered is even!"); // if a number divisible by 2 ===> it is "even"

        }

        if (num%2 != 0){
            System.out.println("The number you entered is odd "); // if a number is not divisible by 2 ===> the number is odd

        }

         //if else statements
        // if is used to define a specific scenario
        //when i have two different scenarios, and the only will be true, i can use "else" part for the second condition.....

        // scenari instead of another independent if body
        //So java will save energy in comparison to two independent if statemens

        // java works less here
         //2. way

        if(num%2 == 0){
            System.out.println("The number you entered is even!");

        } else {
            System.out.println("The number you entered is odd ");
        }


    }
}
