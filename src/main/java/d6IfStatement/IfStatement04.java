package d6IfStatement;

import java.util.Scanner;

public class IfStatement04 {

    public static void main(String[] args) {

        //Example: Ask user to enter number of the day in a week and print day name based on the input
       //1 way
        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter a number for day of the week");

        int dayNumber = input.nextByte();

        if (dayNumber == 1){

            System.out.println("day is monday");
        } else if (dayNumber == 2){

            System.out.println("day is thuesday");
        } else if (dayNumber == 3) {

            System.out.println("day is wednesday");
        } else if (dayNumber == 4) {

            System.out.println("day is thursday");
        } else if (dayNumber == 5) {

            System.out.println("day is friday");
        } else if (dayNumber == 6) {

            System.out.println("day is saturday");
        } else if (dayNumber == 7) {

            System.out.println("day is sunday");
        } else {

            System.out.println(" you gave a wrong number");
        }

        //2way recommend way

        if(dayNumber <1 || dayNumber >7){
            System.out.println("you gave a wrong number ");
        } else if (dayNumber == 1){

            System.out.println("day is monday");
        }  else if (dayNumber == 2){

            System.out.println("day is thuesday");
        } else if (dayNumber == 3) {

            System.out.println("day is wednesday");
        } else if (dayNumber == 4) {

            System.out.println("day is thursday");
        } else if (dayNumber == 5) {

            System.out.println("day is friday");
        } else if (dayNumber == 6) {

            System.out.println("day is saturday");
        } else if (dayNumber == 7) {

            System.out.println("day is sunday");
        }

    }
}
