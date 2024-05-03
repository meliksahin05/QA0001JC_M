package d4Scanner_Concatenation;

import java.util.Scanner;

public class Scanner05 {

    //type main method
    public static void main(String[] args) {

        //Example: Ask the user to enter two different numeric data
        //And calculate: total value, difference, multiplication and division of number in different lines
        //Please use double

       //Create instance(object) from Scanner Class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers.... ");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("Total = " + (firstNumber + secondNumber)); //without parantesis, java read the sentences and combine with number
        System.out.println("Difference = " + (firstNumber - secondNumber));
        System.out.println("Multiplication = " + (firstNumber * secondNumber));
        System.out.println("Division = " + (firstNumber / secondNumber));


        System.out.println("Division = " + String.format("%.2f",(firstNumber / secondNumber))); // i wanna modify the decimal part
        System.out.println("Division = " + String.format("%.3f",(firstNumber / secondNumber)));
        System.out.println("Division = " + String.format("%.4f",(firstNumber / secondNumber)));

    }
}
