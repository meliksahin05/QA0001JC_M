package d6IfStatement;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        //When we have two conditions, we can use if else statements.....

        //When we have conditions more than 2, we can use "if , else if-, else if,..... "else"

        // if (specific scenario){
        // } else if (another scenario ) {
        // } else if (another scenario) {
        // else { }


        //Example check the given number by user if it is negative, positive, neuter/zero

        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        if(num > 0){
            System.out.println(num + " is a positive number.");
        } else if (num < 0){
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println(num + " is zero or neuter");
        }




    }
}
