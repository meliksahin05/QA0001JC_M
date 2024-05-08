package d15NestedLoops_WhileLoop;

import java.util.Scanner;

public class WhileLoops02 {

    public static void main(String[] args) {


        //Example; Create a multiplication table on the console to the given number by the user

        /*

        3x1 = 3
        3x2 = 6
        3x3 = 9
        3x4 = 12
        .....

        3x10 = 30
         */

        //create an object from scanner class.....
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to draw multiplication table!!!!");

        int num = input.nextInt();

        int i = 1;

        while(i<=10){

            if (num <1 || num >10){

                System.out.println("Please enter a number between 1-10");
                break;
            }

            System.out.println(num + "x" + i + "= " + (num*i));

            i++;
        }


    }
}
