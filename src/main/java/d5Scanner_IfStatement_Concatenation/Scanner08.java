package d5Scanner_IfStatement_Concatenation;

import java.util.Scanner;

public class Scanner08 {

    //type main method
    public static void main(String[] args) {

        //Question:
         /*
         Ask user to enter an integer with 5 digits
         Then calculate total value of first two digits and last 2 digits
         Example:  45825 ===> 45 + 25 == 70
          */

        //by dividing by 1000, we will have 45.825
        // ===> int removes decimal part and we have 45 as result

        //if we use modulus operator (mod method in math) ("%")
        //We can get remainder in division operation
        // So when we divide our number by 100; last two digits will be remainder.....

        //Create an object from Scanner Class
        Scanner input = new Scanner(System.in);


        //Give a message to user
        System.out.println("Enter a 5 digit");

        //to get first two digit
        int num = input.nextInt(); // data is accepted from outside....

        int firstTwoDigits = num/1000;

        System.out.println("This is first two digits :" + firstTwoDigits);

        int lastTwoDigits = num%100;

        System.out.println("Total of first and last two digits ; " + (firstTwoDigits+lastTwoDigits));

        //MODULUS "%" OPERATOR GIVES US THE REMAINDER OF DIVISION OPERATION!!!!


        int x = 135;
        System.out.println("first value of x ; " + x);

         x = 1459235;
        System.out.println("value of x on the second line ; " + x);



    }
}
