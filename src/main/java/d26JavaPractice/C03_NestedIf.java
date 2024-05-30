package d26JavaPractice;

import java.util.Scanner;

public class C03_NestedIf {

    public static void main(String[] args) {


        /*
        Ask the user to enter a number....

        if the number is less than zero, print "Negative" on the console..


       if the number is greater than zero,
           if the number is less than 10, print "Digit number" on the console
             if the number is greater than 10, print "Positive number" on the console....
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();

       if (number<0){
           System.out.println("Negative");
       }else if(number>=0){
           if (number<10){
               System.out.println("Digit Number");
           }else {
               System.out.println("Positive number");
           }

       }
    }
}
