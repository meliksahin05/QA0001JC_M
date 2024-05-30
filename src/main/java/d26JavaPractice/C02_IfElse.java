package d26JavaPractice;

import java.util.Scanner;

public class C02_IfElse {

    public static void main(String[] args) {

        /*
        Ask the user for two number
        -if both number are positive, print the sum of the numbers.....
        Print multiplication of the numbers if they are both negative....
        If two have different signs, print that "operations with numbers cannot be performed"
        if there is a number equal to zero, print "absording number"

         */

        // 1st way and faster way for java
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = scan.nextInt();
        System.out.println("Please enter second number");
        int num2 = scan.nextInt();


        if (num1 > 0 && num2>0){
            System.out.println("Sum of them = " +(num1+num2));
        } else if (num1<0 && num2<0) {
            System.out.println("Multiplication of them = " + num1*num2);

        } else if (( num1<0 && num2>0) || (num1>0 && num2<0)){
            System.out.println("Operations with numbers cannot be performed");
        } else {
            System.out.println("Absording number");
        }


        //2nd way but java is working to much here because java checks every if statement.....

        //        Scanner input=new Scanner(System.in);
//        System.out.println("Please enter a number ");
//        int numA=input.nextInt();
//        System.out.println("Please enter second number ");
//        int numB=input.nextInt();
//
//
//        if (numA>0&&numB>0){
//            System.out.println("Sum of given numbers is "+(numA+numB));
//        } if (numA<0&&numB<0){
//            System.out.println("Multiplication of given numbers is "+(numA*numB));
//        } if ((numA<0&&numB>0) ||(numA>0&&numB<0)){
//            System.out.println("Operations with numbers cannot be performed");
//        } if (numA==0||numB==0) {
//            System.out.println("absording number");
//        }


    }
}
