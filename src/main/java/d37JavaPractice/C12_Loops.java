package d37JavaPractice;

import java.util.Scanner;

public class C12_Loops {

    public static void main(String[] args) {


        //Write a code  that calculates the factorial of a given number from user


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid number");
        int number = scan.nextInt();
        int factorial = 1;
        if(number<0){

            System.out.println("Please eneter a valid number");

        }else {



            for (int i = 1; i <=number ; i++) {

                factorial *= i;

            }
            System.out.println(factorial); //120 if you enter 5......
        }




    }
}
