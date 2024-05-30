package d26JavaPractice;

import java.util.Scanner;

public class C07_FORLOOPS {

    public static void main(String[] args) {

        /*
        Ask the user to enter 5 numbers...

        calculate the sum of these numbers exluding thoose whose ones digits is 7 or 9.....

        -11
        -2
        -19
        -22
        -47
         */

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for (int i=0; i<5; i++){

            System.out.println("Please enter a number");
            int number = scan.nextInt();

            if (number%10 !=7 && number%10 !=9){

                sum = sum +number;

            }
        }
        System.out.println("sum = " + sum);


    }


}
