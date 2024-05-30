package d26JavaPractice;

import java.util.Scanner;

public class C04_Ternary {

    public static void main(String[] args) {

        /*
        Get a number from the user
        2.uuse Trnary
        -if the entered number is even, print "Even Number" on the console
        -if the entered number is odd, increase the number by 3 and print it on the console

        Syntax of Ternary = condition ? (true) : (false)
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please give a number");
        int number = input.nextInt();

        //1.way

        Object result =number%2 ==0 ? ("Even Number") : (number+3);
        System.out.println("result = " + result);

        //2.way
        System.out.println(number%2 ==0 ? ("Even Number") : (number+3));

    }
}
