package d26JavaPractice;

import java.util.Scanner;

public class C08_WhileLoops {

    public static void main(String[] args) {


        //get the number from user.....

        //Starting from the entered number, print numbers consecutively until it is a multiple by 10.....

        /*
        22

        22,23,24,25,26,27,28,29
         */

        /*
        Syntax of while loop

        starting value

        while(condition){
         executed your codes.....
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number ");

        int number = scan.nextInt(); //starting

        while(number%10!=0){
            System.out.print(number + " ");
            number++;
        }

        System.out.println("number = " + number);


    }
}
