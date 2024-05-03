package d7IfStatement_Switch;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {


//Example: when the users enters number of month, print the related month name and month names after the month
        // Print month name and rest of the months names

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of the month");

        byte numOfMonth = input.nextByte();


        switch (numOfMonth){

            case 1:
                System.out.println("January");
            case 2 :
                System.out.println("February");
            case 3:
                System.out.println("march");
            case 4 :
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6 :
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8 :
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10 :
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12 :
                System.out.println("December");
                break ;
            default:
                System.out.println("it is not valid month ");
        }


        //We can not use double , float, long and boolean data type in switch statement



    }
}
