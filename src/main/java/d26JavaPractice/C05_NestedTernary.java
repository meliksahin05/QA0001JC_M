package d26JavaPractice;

import java.util.Scanner;

public class C05_NestedTernary {

    public static void main(String[] args) {

        /*
        Get two number from the user
        using ternary
        - if the numbers are equal, print "Number are equal" on the console....
        -if the numbers are not equal, print the square of the larger number on the console.....
         */

       Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = scan.nextInt();
        System.out.println("Enter second number");
        int number2 = scan.nextInt();

        Object result = number1 == number2 ? ("Numbers are equal") : (number1>number2) ? (number1*number1):(number2*number2);
        System.out.println("result = " + result);



    }
}
